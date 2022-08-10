package com.tav.dockerizedspringexample.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("greeting-service")
@Configuration
public class GreetingConfig {
    @Getter
    @Value("${greeting.prefix}")
    private String greetPrefix;
}
