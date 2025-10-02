package com.openmaru.service;

import org.springframework.stereotype.Service;

@Service 
public class GreetingService { 

    public String createGreeting(String name) {
        
        if (name == null || name.trim().isEmpty()) {
            name = "Guest";
        }

        System.out.println(java.time.LocalDateTime.now() + ": " + name + "님께 인사 생성");

        return "Hello, " + name + "!";
    }
}
