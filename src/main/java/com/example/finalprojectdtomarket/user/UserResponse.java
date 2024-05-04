package com.example.finalprojectdtomarket.user;

import lombok.Data;

import java.sql.Date;

public class UserResponse {
    @Data
    public static class JoinDTO {
        private String password;
        private String username;
        private String phone;
        private String email;
        private Date birth;
        private Integer role;

        public JoinDTO(User user) {
            this.password = user.getPassword();
            this.username = user.getUsername();
            this.phone = user.getPhone();
            this.email = user.getEmail();
            this.birth = user.getBirth();
            this.role = user.getRole();
        }
    }
}
