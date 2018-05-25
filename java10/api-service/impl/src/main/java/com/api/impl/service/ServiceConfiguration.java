package com.api.impl.service;

import com.api.impl.database.ClientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public ClientService clientService(ClientRepository repository) {
        return new ClientService(repository);
    }
}
