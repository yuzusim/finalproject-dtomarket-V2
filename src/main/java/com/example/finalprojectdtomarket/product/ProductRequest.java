package com.example.finalprojectdtomarket.product;

import jakarta.persistence.Column;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

public class ProductRequest {

    @Data
    public static class UpdateDTO {
        private String name;
        private Integer price;
        private Integer qty;
        private MultipartFile img;
    }
}
