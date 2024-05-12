package com.example.finalprojectdtomarket.cart;


import com.example.finalprojectdtomarket.product.Product;
import com.example.finalprojectdtomarket.user.User;
import lombok.Data;

import java.sql.Timestamp;

public class CartRequest {

    //장바구니 업데이트
    @Data
    public static class UpdateDTO{
        private Integer cartId;
        private Integer orderQty;
        private Boolean isChecked;
    }

    @Data
    public static class saveDTO {
//        private Integer userId;
        private Integer productId;
        private Integer orderQty;
        private Boolean isChecked;

        public Cart toEntity(User sessionUser, Product product) {
            return Cart.builder()
                    .product(product)
                    .orderQty(orderQty)
                    .isChecked(isChecked)
                    .user(sessionUser)
                    .build();
        }

    }


}
