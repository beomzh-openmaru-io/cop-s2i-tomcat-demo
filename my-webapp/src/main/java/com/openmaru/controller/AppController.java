package com.openmaru.controller;

import com.openmaru.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

     @Autowired // 스프링! 주방장(GreetingService)을 여기 자동으로 연결해줘!
    private GreetingService greetingService; // 주방장을 호출할 준비 완료

    /**
     * GET / 요청을 처리 (폼을 보여주는 역할)
     */
    @GetMapping("/")
    public String showForm() {
        return "index"; // "index.jsp"를 보여줌
    }

    /**
     * POST /api 요청을 처리 (폼 제출 처리)
     */
    @PostMapping("/api")
    public String handleGreeting(@RequestParam("name") String name, Model model) {
        // 1. @RequestParam으로 파라미터 받기 (더 간결함)
        // 2. 서비스 로직 호출
        String greetingMessage = greetingService.createGreeting(name);

        // 3. Model 객체에 결과 저장 (request.setAttribute와 유사)
        model.addAttribute("message", greetingMessage);

        // 4. 결과를 보여줄 JSP 이름 반환
        return "greeting"; // "greeting.jsp"로 포워딩
    }
}
