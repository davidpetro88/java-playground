package com.spring5.di.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:other.properties")
})
public class PropertyConfig {
    @Value("${message.other}")
    private String messageFromOtherPropertie;

    public String getMessageFromOtherPropertie() {
        return messageFromOtherPropertie;
    }
}
