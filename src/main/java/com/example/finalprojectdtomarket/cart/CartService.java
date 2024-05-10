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
        
        List<CartResponse.ListDTO> respDTO = carts.stream().map(cart -> new CartResponse.ListDTO(cart)).toList();
        System.out.println("respDTO = " + respDTO);

        return respDTO;
    }

}
