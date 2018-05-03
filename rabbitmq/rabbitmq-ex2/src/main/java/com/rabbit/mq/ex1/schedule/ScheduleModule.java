package com.rabbit.mq.ex1.schedule;

import com.rabbit.mq.ex1.rabbitmq.Producer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScheduleModule {

    @Bean
    public Schedule schedule(Producer producer) {
        return new Schedule(producer);
    }
}
