package com.example.kafkasampleproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaSampleProducerController {

    @Autowired
    private KafkaSampleProducerService kafkaSampleProducerService;

    @PostMapping(value = "/sendMessage")
    public void sendMessage(@RequestBody String message) {
        kafkaSampleProducerService.sendMessage(message);
    }
}