package com.mally.testProject.controller;

import lombok.AllArgsConstructor;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class AwsSqsListener {
    @SqsListener("${queue.url}")
    public void receive(String message, @Header("SenderId") String senderId) {
        System.out.println(message);
    }
}
