package com.example.finalprojectdtomarket.cart;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class CartController {
    private final CartService cartService;
    private final HttpSession session;


    // 장바구니 목록
    @GetMapping({"/cart-list"})
    public String list() {


        return "cart/cart-form";
    }


    // 장바구니 담기
    @PostMapping("/cart/{id}/save")
    public String saveCart() {
        return "redirect:/cart-list";
    }


    @PostMapping("/cart/update")
    public @ResponseBody String update() {
        return "구매를 진행하겠습니다.";
    }
}
