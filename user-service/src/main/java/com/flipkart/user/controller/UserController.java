package com.flipkart.user.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<String> getAllUsers() {
        return Arrays.asList("user1", "user2", "user3");
    }

    @PostMapping
    public String createUser(@RequestBody String user) {
        return "User created: " + user;
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id) {
        return "User ID: " + id;
    }
}
