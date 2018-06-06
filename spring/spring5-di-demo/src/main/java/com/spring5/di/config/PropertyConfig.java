package com.spring5.di.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:other.properties"),
        @PropertySource("classpath:my.properties")
})
public class PropertyConfig {
    @Value("${my.message}")
    private String myMessage;

    @Value("${other.message}")
    private String otherMessage;

    public String getMyMessage() {
        return myMessage;
    }

    public String getOtherMessage() {
        return otherMessage;
    }
}
