package com.example.finalprojectdtomarket.user;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserJPARepository userJPARepository;

    @Transactional
    public UserResponse.JoinDTO joinUser(UserRequest.JoinDTO reqDTO) {
        User user = userJPARepository.save(reqDTO.toEntity());
        user.setRole(2);
        userJPARepository.save(user);
        return new UserResponse.JoinDTO(user);
    }
}
