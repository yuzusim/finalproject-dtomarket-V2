package com.example.finalprojectdtomarket.order;

import com.example.finalprojectdtomarket.cart.CartResponse;
import com.example.finalprojectdtomarket.user.User;
import com.example.finalprojectdtomarket.user.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class OrderController {
    private final OrderService orderService;
    private final UserService userService;
    private final HttpSession session;

    // 주문 목록
    @GetMapping({"/order-list"})
    public String list() {
        return "";
    }

    // 주문하기
    @GetMapping("/order/save-form")
    public String orderSaveForm(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        User user = userService.findUserId(sessionUser.getId());

        List<CartResponse.ListDTO> cartList = orderService.orderCartList(user.getId());
        System.out.println("잘나오나 " + cartList);

        //totalSum 계산용...
        Integer totalSum = cartList.stream().mapToInt(value -> value.getSum()).sum();
        request.setAttribute("user", user);
        request.setAttribute("cartList", cartList);
        request.setAttribute("totalSum", totalSum);

        return "order/save-form";
    }

    // 주문하기
    @PostMapping("/order/save")
    public String orderSave(OrderRequest.SaveDTO reqDTO) {
        //System.out.println("오더리스트 나왕? " + reqDTO);

        User sessionUser = (User) session.getAttribute("sessionUser");
        User user = userService.findUserId(sessionUser.getId());

        //Enum 쓰기!!
        reqDTO.setStatus(OrderStatus.ORDER_COMPLETE);

        //구매하기 로직
        orderService.saveOrder(reqDTO, user);

        return "redirect:/order-list";
    }

    // 삭제하기
    @PostMapping("/order/{id}/delete")
    public String delete() {
        return "";
    }
}
