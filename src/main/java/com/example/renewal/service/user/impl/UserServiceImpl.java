package com.example.renewal.service.user.impl;

import com.example.renewal.mapstruct.UserMapper;
import com.example.renewal.models.dto.UserRegistrationRequest;
import com.example.renewal.models.entity.user.User;
import com.example.renewal.repo.user.UserRepository;
import com.example.renewal.service.user.inter.UserServiceInter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServiceInter {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public User registerUser(UserRegistrationRequest registrationRequest) {
        if (userRepository.findUserByEmail(registrationRequest.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email address already in use");
        }
        User user = userMapper.userRegistrationRequestToUser(registrationRequest);


        return userRepository.save(user);
    }
}
