package com.robin.springboot02config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${person.name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "Hello " + name;
    }
}