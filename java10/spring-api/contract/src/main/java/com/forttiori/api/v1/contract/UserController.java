package com.forttiori.api.v1.contract;

import com.forttiori.api.UserModel;
import com.forttiori.api.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("")
public class UserController {

    private UserService userService;

    @GetMapping(path = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Flux<UserModel> users(){
        return userService.userModel();
    }

    @GetMapping(path = "/hello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Mono<Hello> hello(){
        return Mono.just(Hello.builder().message("Hello World").build());
    }
}
