package com.spring5.di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello First implementation!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
