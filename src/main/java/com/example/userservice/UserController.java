package com.example.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // ✅ GET API
    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    // ✅ ADD THIS (POST API)
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}