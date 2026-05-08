package com.example.userservice;

import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
}