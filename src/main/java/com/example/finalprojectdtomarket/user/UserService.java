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
    public UserResponse.LoginDTO login(UserRequest.LoginDTO requestDTO) {
        User sessionUser = userJPARepository.findByUsernameAndPassword(requestDTO.getUsername(), requestDTO.getPassword())
                .orElseThrow(() -> new Exception401("아이디 혹은 비밀번호가 일치하지 않습니다."));

        //sessionUser.getRole 에서 2가 들어오면 true (2면 유저) 유저냐? 예스예스
        Boolean isCheck = sessionUser.getRole() == 2;

        return new UserResponse.LoginDTO(sessionUser, isCheck);

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
