package com.rabbit.mq.ex1.rabbitmq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class Module {

    @Bean
    public Producer producer(Environment environment) {
        return new Producer(environment);
    }

    @Bean
    public Consumer consumer(Environment environment) {
        return new Consumer(environment);
    }
}
