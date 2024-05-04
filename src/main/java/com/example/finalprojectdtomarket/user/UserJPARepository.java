package com.example.finalprojectdtomarket.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface UserJPARepository extends JpaRepository<User, Integer> {
    User findByUsername(@PathVariable("username") String username);
}
