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

    // ✅ LOGIN (OPTIMIZED - NO findAll, direct DB query)
    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User dbUser = userRepository
                .findByUsernameAndPassword(user.getUsername(), user.getPassword())
                .orElse(null);

        if (dbUser == null) {
            return "Invalid credentials";
        }

        return jwtUtil.generateToken(dbUser.getUsername(), dbUser.getRole());
    }
}