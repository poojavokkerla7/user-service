package com.example.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    // ✅ REGISTER
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userRepository.save(user);
    }

    // ✅ LOGIN
    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User dbUser = userRepository.findAll()
                .stream()
                .filter(u -> u.getUsername().equals(user.getUsername())
                        && u.getPassword().equals(user.getPassword()))
                .findFirst()
                .orElse(null);

        if (dbUser == null) {
            return "Invalid credentials";
        }

        return jwtUtil.generateToken(user.getUsername());
    }
}