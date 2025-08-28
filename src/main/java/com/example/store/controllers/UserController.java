package com.example.store.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.store.entities.User;
import com.example.store.repositories.UserRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @RequestMapping("/users")
        public Iterable<User> getAllUsers() {
            return userRepository.findAll();
        }
}
