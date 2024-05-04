package com.example.finalprojectdtomarket.user;

import com.example.finalprojectdtomarket._core.errors.exception.Exception403;
import com.example.finalprojectdtomarket._core.errors.exception.Exception404;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserJPARepository userJPARepository;

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
