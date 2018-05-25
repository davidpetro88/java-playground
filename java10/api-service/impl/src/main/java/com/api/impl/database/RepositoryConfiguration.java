package com.api.impl.database;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.api.impl.database")
public class RepositoryConfiguration {
}
