package com.openmaru.controller;

import com.openmaru.service.GreetingService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AppServlet extends HttpServlet {
    private final GreetingService greetingService = new GreetingService();

    // POST 요청 처리 (폼 제출)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 1. 요청에서 사용자 이름 파라미터 가져오기
        String name = request.getParameter("name");

        // 2. 서비스 로직 호출
        String greetingMessage = greetingService.createGreeting(name);

        // 3. 결과를 request에 속성으로 저장
        request.setAttribute("message", greetingMessage);

        // 4. 결과를 보여줄 JSP 페이지로 포워딩
        RequestDispatcher dispatcher = request.getRequestDispatcher("/greeting.jsp");
        dispatcher.forward(request, response);
    }
}
