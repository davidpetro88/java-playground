package com.rabbit.mq.ex1.rabbitmq.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;


@Data
public class PropertieLoader {

    @Value("${exchange.name}")
    private String exchangeName;

    @Value("${queue.generic.name}")
    private String queueGenericName;

    @Value("${queue.specific.name}")
    private String queueSpecificName;

    @Value("${routing.key}")
    private String routingKey;
}
