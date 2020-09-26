package com.robin.springboot04webjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/abc")
    public String abc(Model model) {
        model.addAttribute("msg", "Hello");
        return "success";
    }
}
