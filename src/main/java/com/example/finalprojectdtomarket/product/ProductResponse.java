package com.example.finalprojectdtomarket.product;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

public class ProductResponse {

    // 상품 정보 수정
    @Data
    public static class UpdateDTO{
        private int id;
        private String name;
        private Integer price;
        private Integer qty;
        private String img;

        public UpdateDTO(Product product) {
            this.id = product.getId();
            this.name = product.getName();
            this.price = product.getPrice();
            this.qty = product.getQty();
            this.img = product.getImg();
        }
    }

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
