package com.example.finalprojectdtomarket.user;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;
    private final HttpSession session;

    // 회원가입
    @PostMapping("/join")
    public String join() {
        return "redirect:/login-form";
    }

    @GetMapping("/join-form")
    public String joinForm() {
        return "user/join-form";
    }

    //회원가입 중복체크
    @GetMapping("/api/username-same-check")
    public String usernameSameCheck() {
        return "";
    }


    // 로그인
    @PostMapping("/login")
    public String login() {
        return "redirect:/";
    }

    @GetMapping("/login-form")
    public String loginForm() {
        return "user/login-form";
    }


    // 회원 정보 수정
    @PostMapping("/user/update")
    public String update() {
        return "redirect:/";
    }

    @GetMapping("/user/update-form")
    public String updateForm() {
        return "user/update-form";
    }


    // 로그아웃
    @GetMapping("/logout")
    public String logout() {
        return "redirect:/";
    }
}
