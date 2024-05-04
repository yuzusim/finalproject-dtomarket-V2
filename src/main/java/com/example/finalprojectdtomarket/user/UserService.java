package com.example.finalprojectdtomarket.user;

import com.example.finalprojectdtomarket._core.errors.exception.Exception401;
import com.example.finalprojectdtomarket._core.errors.exception.Exception403;
import com.example.finalprojectdtomarket._core.errors.exception.Exception404;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserJPARepository userJPARepository;

    //로그인 용
    public User loginUser(UserRequest.LoginDTO requestDTO) {
        User sessionUser = userJPARepository.findByUsernameAndPassword(requestDTO.getUsername(), requestDTO.getPassword())
                .orElseThrow(() -> new Exception401("아이디 혹은 비밀번호가 일치하지 않습니다."));
        return sessionUser;
    }

    public User getUsername(String username) {
        return userJPARepository.findByUsername(username);
    }
    @Transactional
    public UserResponse.JoinDTO joinUser(UserRequest.JoinDTO reqDTO) {
        User user = userJPARepository.save(reqDTO.toEntity());
        user.setRole(2);
        userJPARepository.save(user);
        return new UserResponse.JoinDTO(user);
    }
}
