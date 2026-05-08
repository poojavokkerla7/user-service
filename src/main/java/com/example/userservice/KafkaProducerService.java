package com.example.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaConsumerService consumer;

    public void sendMessage(String message) {
        System.out.println("Message sent: " + message);
        consumer.consume(message);
    }
}