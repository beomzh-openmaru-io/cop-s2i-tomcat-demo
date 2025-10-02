package com.openmaru.service;

import org.springframework.stereotype.Service;

@Service // 나는 "서비스" 역할을 하는 중요한 클래스야! 라고 스프링에게 알려줌
public class GreetingService { // 역할: 주방장

    public String createGreeting(String name) {
        // 여기에 복잡한 로직이 들어갈 수 있음
        if (name == null || name.trim().isEmpty()) {
            name = "Guest";
        }

        System.out.println(java.time.LocalDateTime.now() + ": " + name + "님께 인사 생성");

        return "Hello, " + name + "!";
    }
}
