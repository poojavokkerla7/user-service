package com.example.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repo;

    @GetMapping
    public List<User> getUsers() {
        return repo.findAll();
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return repo.save(user);
    }
}