package com.robin.springboot02config.config;

import com.robin.springboot02config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
    @Bean
    public HelloService helloService1() {
        System.out.println("MyAppConfig");
        return new HelloService();
    }
}
