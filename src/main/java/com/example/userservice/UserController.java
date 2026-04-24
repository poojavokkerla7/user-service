package com.example.userservice;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<Map<String, String>> users = new ArrayList<>();
    private RestTemplate restTemplate = new RestTemplate();

    @PostMapping("/register")
    public String register(@RequestBody Map<String, String> user) {
        users.add(user);
        return "User Registered";
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> user) {
        for (Map<String, String> u : users) {
            if (u.get("username").equals(user.get("username")) &&
                u.get("password").equals(user.get("password"))) {
                return "Login Successful";
            }
        }
        return "Invalid Credentials";
    }

    // 🔥 THIS IS THE MISSING PART
    @GetMapping("/tasks")
    public Object getTasksFromTaskService() {
        String url = "http://localhost:8082/tasks";
        return restTemplate.getForObject(url, Object.class);
    }
}