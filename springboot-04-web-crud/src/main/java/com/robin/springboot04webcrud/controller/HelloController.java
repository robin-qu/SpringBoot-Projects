package com.robin.springboot04webcrud.controller;

import com.robin.springboot04webcrud.exception.UserNotExistException;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String hello(@RequestParam("user") String user) {
        if (user.equals("aaa")) {
            throw new UserNotExistException();
        }
        return "Hello World!";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("Hello", "<h1>Hi</h1>");
        map.put("users", Arrays.asList("robin", "Lisa", "Mike"));
        return "success";
    }
}
