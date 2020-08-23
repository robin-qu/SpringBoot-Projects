package com.robin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication: declares this is an Spring Boot application
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        // launch the spring application
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
