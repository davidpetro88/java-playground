package com.rabbitmq.ex2.rabbitmq;

import com.rabbitmq.ex2.rabbitmq.config.PropertieLoader;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqModule {
    @Bean
    public Producer producer(RabbitTemplate rabbitTemplate, PropertieLoader propertieLoader) {
        return new Producer(rabbitTemplate, propertieLoader);
    }

    @Bean
    public Consumer consumer() {
        return new Consumer();
    }
}
