package com.example.kafkasampleproject;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaSampleConsumerService {

    @KafkaListener(topics = "new-topic", groupId = "test-group-id")
    public void consume(String message) throws IOException {
        System.out.println("receive message : " + message);
    }
}