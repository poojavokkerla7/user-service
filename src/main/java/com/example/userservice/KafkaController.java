package com.example.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerService producer;

    @PostMapping("/send")
    public String sendMessage(@RequestBody String message) {
        producer.sendMessage(message);
        return "Message processed";
    }
}