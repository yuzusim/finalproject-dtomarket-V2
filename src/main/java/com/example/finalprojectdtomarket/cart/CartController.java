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
        return "";
    }

    // 상세보기
    @GetMapping("/cart/{id}")
    public String detail() {
        return "";
    }

    // 장바구니 담기
    @PostMapping("/cart/{id}/save")
    public String saveCart() {
        return "redirect:/cart-list";
    }

    // 수정하기 - 수량 수정은 버튼으로 하면 수정 폼이 필요 없을 거 같아요
//    @GetMapping("/cart/{id}/update-form")
//    public String updateForm(){
//        return "";
//    }
//
//    @PostMapping("/cart/{id}/update")
//    public String update(){
//        return "";
//    }

    // 삭제하기 - 주문하면 삭제되고 어디로 반환돼야 하는지 모르겠어요
    @PostMapping("/cart/{id}/delete")
    public String delete() {
        return "";
    }
}
