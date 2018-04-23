package com.rabbit.mq.ex1.schedule;

import com.rabbit.mq.ex1.rabbitmq.Consumer;
import com.rabbit.mq.ex1.rabbitmq.Producer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScheduleModule {

    @Bean
    public Schedule schedule(Consumer consumer, Producer producer) {
        return new Schedule(consumer, producer);
    }
}
