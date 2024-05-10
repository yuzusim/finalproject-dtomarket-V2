package com.example.finalprojectdtomarket.cart;

import com.example.finalprojectdtomarket.product.Product;
import lombok.Data;

public class CartResponse {

    @Data
    public static class ListDTO {
        private Integer id;     //cartId
        private Integer orderQty;       //구매수량

        private String img;
        private String pName;       //상품명
        private Integer price;      //상품단가

        private Integer sum;        //가공하기

        public ListDTO(Cart cart) {
            this.id = cart.getId();
            this.orderQty = cart.getOrderQty();
            this.img = cart.getProduct().getImg();
            this.pName = cart.getProduct().getName();
            this.price = cart.getProduct().getPrice();
            //sum은 가공하기
        }
    }

}