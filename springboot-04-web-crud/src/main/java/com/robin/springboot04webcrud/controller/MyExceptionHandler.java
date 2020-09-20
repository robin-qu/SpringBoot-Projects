package com.robin.springboot04webcrud.controller;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.robin.springboot04webcrud.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {
    // // both browser and client return json
    // @ResponseBody
    // @ExceptionHandler(UserNotExistException.class)
    // public Map<String, Object> handleException(Exception e) {
    //     Map<String, Object> map = new HashMap<>();
    //     map.put("code", "user.notexist");
    //     map.put("message", e.getMessage());
    //     return map;
    // }

    // browser returns html and client returns json
    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        // get error status code  4xx 5xx to redirect to customized error page
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("code", "user.notexist");
        map.put("message", e.getMessage());
        request.setAttribute("extend", map);
        // forward to /error
        return "forward:/error";
    }
}
