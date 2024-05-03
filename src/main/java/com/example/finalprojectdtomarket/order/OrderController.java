package com.example.finalprojectdtomarket.order;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class OrderController {
    private final OrderService orderService;
    private final HttpSession session;

    // 주문 목록
    @GetMapping({"/order-list"})
    public String list() {
        return "";
    }

    // 주문하기
    @PostMapping("/order/{id}")
    public String order() {
        return "redirect:/order-list";
    }

    // 삭제하기
    @PostMapping("/order/{id}/delete")
    public String delete() {
        return "";
    }
}
