package com.pallavi.demo.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumeMessage {
    @KafkaListener(topics = "pallavi-topic", groupId = "foo")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in pallavi-topic and group Id foo: " + message);
    }
}
