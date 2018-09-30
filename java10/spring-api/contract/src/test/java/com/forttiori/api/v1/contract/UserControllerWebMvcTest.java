package com.forttiori.api.v1.contract;

import com.forttiori.api.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {UserController.class, UserService.class})
@WebFluxTest(UserController.class)
public class UserControllerWebMvcTest {

    @Autowired
    private WebTestClient webTestClient;

    @Autowired
    private ApplicationContext applicationContext;

    @Before
    public void beforeEach() {
        this.webTestClient =
                WebTestClient.bindToApplicationContext(applicationContext)
                        .configureClient()
//                        .baseUrl("/user")
                        .build();
    }

    @Test
    public void users() throws Exception {

        webTestClient.get()
                .uri("/user ")
                .exchange()
                .expectStatus()
                .is2xxSuccessful();
    }

    @Test
    public void hello() throws Exception {

        webTestClient.get()
                .uri("/hello")
                .exchange()
                .expectStatus()
                .is2xxSuccessful();
    }
}
