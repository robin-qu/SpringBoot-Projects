package com.robin.springboot04webcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
    // @RequestMapping({"/", "/index.html"})
    // public String index() {
    //     return "index";
    // }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("Hello", "<h1>Hi</h1>");
        map.put("users", Arrays.asList("robin", "Lisa", "Mike"));
        return "success";
    }
}
