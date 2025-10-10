package com.openmaru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {


    /**
     * GET / 요청을 처리 (폼을 보여주는 역할)
     */
    @GetMapping("/")
    public String showForm() {
        return "index"; // "index.jsp"를 보여줌
    }

}
