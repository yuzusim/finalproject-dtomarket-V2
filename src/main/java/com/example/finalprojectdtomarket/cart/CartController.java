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


    // 장바구니 목록
    @GetMapping({"/cart-list"})
    public String list() {
        return "/order/list";
    }

    //상세보기
    @GetMapping("/cart/{id}")
    public String detail() {
        return "";
    }

    //구매하기
    @PostMapping("/cart/{id}/order")
    public String order() {
        return "redirect:/order/list";
    }

    //주문 폼
    @GetMapping("/cart/{id}/order-form")
    public String orderForm(){
        return "";
    }

    //수정하기
    @GetMapping("/cart/{id}/update-form")
    public String updateForm(){
        return "";
    }

    @PostMapping("/cart/{id}/update")
    public String update(){
        return "";
    }

    //삭제하기
    @PostMapping("/cart/{id}/delete")
    public String delete() {
        return "redirect:/cart-list";
    }
}
