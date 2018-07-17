package com.lab9.zull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class SpringMicroservicesZuulApplication {

	@Bean
	public MyZuulFilter filter(){
		return new MyZuulFilter();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesZuulApplication.class, args);
	}
}
