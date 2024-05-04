package com.example.finalprojectdtomarket.user;

import jakarta.persistence.Column;
import lombok.Data;

import java.sql.Date;

public class UserRequest {

    // 로그인 용
    @Data
    public static class LoginDTO {
        private String username;
        private String password;

    }


    @Data
    public static class JoinDTO {
        private String password;
        private String username;
        private String phone;
        private String email;
        private Date birth;
        private Integer role;
        public User toEntity(){
            return User.builder()
                    .username(username)
                    .password(password)
                    .phone(phone)
                    .birth(birth)
                    .email(email)
                    .role(role)
                    .build();
        }
    }
}
