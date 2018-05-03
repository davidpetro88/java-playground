package com.rabbitmq.ex2.boot;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableRabbit
@SpringBootApplication
@ComponentScan(basePackages = "com.rabbit.mq.ex1")
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .listeners(new ApplicationPidFileWriter())
                .web(false)
                .run(args);
    }
}

