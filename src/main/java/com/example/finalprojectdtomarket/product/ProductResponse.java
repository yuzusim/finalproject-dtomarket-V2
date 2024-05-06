package com.example.finalprojectdtomarket.product;

import lombok.Data;

public class ProductResponse {

    //상품 목록보기
    @Data
    public static class ListDTO{
        private Integer id;
        private String name;
        private Integer price;
        private Integer qty;
        private String img;

        public ListDTO(Product product) {
            this.id = product.getId();
            this.name = product.getName();
            this.price = product.getPrice();
            this.qty = product.getQty();
            this.img = product.getImg();
        }
    }
}
