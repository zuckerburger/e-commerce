package com.example.store.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.store.entities.Message;

@RestController
public class MessageController {
    @RequestMapping("/hello")
        public Message sayHello() {
            return new Message("Hello World!");
        }
}
