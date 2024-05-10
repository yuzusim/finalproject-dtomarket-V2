package com.example.finalprojectdtomarket.cart;

import com.example.finalprojectdtomarket.user.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class CartController {
    private final CartService cartService;
    private final HttpSession session;


    // 장바구니 목록
    @GetMapping({"/cart-list"})
    public String list(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        List<CartResponse.ListDTO> cartList = cartService.getCartList(sessionUser.getId());
        request.setAttribute("cartList", cartList);

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
