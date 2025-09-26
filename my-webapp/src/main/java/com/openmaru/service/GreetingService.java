package com.openmaru.service;

public class GreetingService {
    public String createGreeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "안녕하세요, 방문자님!";
        }
        return "안녕하세요, " + name + "님!";
    }
}
