package com.robin.springboot06jpa.controller;

import com.robin.springboot06jpa.entity.User;
import com.robin.springboot06jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseGet(User::new);
    }

    @GetMapping("/user")
    public User insertUser(User user) {
        return userRepository.save(user);
    }
}
