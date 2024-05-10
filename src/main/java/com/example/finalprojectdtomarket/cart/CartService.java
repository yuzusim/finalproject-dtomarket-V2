package com.example.finalprojectdtomarket.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CartService {
    private final CartJPARepository cartJPARepository;

    //cart-list용
    public List<CartResponse.ListDTO> getCartList(Integer userId) {
        List<Cart> carts = cartJPARepository.findByCartUserId(userId);
        
        List<CartResponse.ListDTO> cartList = carts.stream().map(cart -> new CartResponse.ListDTO(cart)).toList();
//        System.out.println("respDTO = " + respDTO);

//        System.out.println("사이즈 몇? " + size);

        Integer indexNum = cartList.size();
        for (CartResponse.ListDTO cart : cartList) {
            cart.setIndexNum(indexNum--);
        }


        return cartList;
    }

}
