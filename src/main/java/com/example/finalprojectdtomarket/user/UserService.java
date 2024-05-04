package com.example.finalprojectdtomarket.user;

import com.example.finalprojectdtomarket._core.errors.exception.Exception404;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserJPARepository userJPARepository;

    //회원정보수정
    public User findById(int id, UserRequest.UpdateDTO reqDTO) {
        User user = userJPARepository.findById(id)
                .orElseThrow(() -> new Exception404("회원정보를 찾을 수 없습니다."));
        user.setPassword(reqDTO.getPassword());
        return user; //더티체킹
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
