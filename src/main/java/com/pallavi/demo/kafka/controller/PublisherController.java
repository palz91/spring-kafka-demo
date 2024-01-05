package com.pallavi.demo.kafka.controller;

import com.pallavi.demo.kafka.service.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {

    @Autowired
    private SendMessage sendMessage;

    @PostMapping(value = "/post-message")
    public void postKafkaMessage(@RequestBody String message) {
        sendMessage.sendMessage(message);
    }
}
