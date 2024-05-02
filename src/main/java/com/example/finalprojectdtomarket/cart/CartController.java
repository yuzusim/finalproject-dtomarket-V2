package com.example.finalprojectdtomarket.cart;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class CartController {
    private final CartService cartService;
    private final HttpSession session;


    //구매목록
    @GetMapping({"/cart/list"})
    public String list() {
        return "/order/list";
    }

    //상세보기
    @GetMapping("/order/{id}")
    public String detail() {
        return "order/update-form";
    }

    //구매하기
    @PostMapping("/order/{id}/add")
    public String save() {
        return "redirect:/order/list";
    }

    //주문 폼
    @GetMapping("/order/{id}/order-form")
    public String orderForm(){
        return "order/order-form";
    }

    //수정하기
    @GetMapping("/order/{id}/update-form")
    public String updateForm(){
        return "order/update-form";
    }

    @PostMapping("/order/{id}/update")
    public String update(){
        return "redirect:/order/"+1;
    }

    //삭제하기
    @PostMapping("/order/{id}/delete")
    public String delete() {
        return "redirect:/";
    }
}
