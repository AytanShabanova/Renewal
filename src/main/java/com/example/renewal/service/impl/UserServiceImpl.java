package com.example.renewal.service.impl;

import com.example.renewal.models.dto.UserRegistrationRequest;
import com.example.renewal.models.entity.User;
import com.example.renewal.repo.UserRepository;
import com.example.renewal.service.UserServiceInter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServiceInter {
    private final UserRepository userRepository;

    @Override
    public User registerUser(UserRegistrationRequest registrationRequest) {
        if (userRepository.findUserByEmail(registrationRequest.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email address already in use");
        }
        User user = new User();
        user.setEmail(registrationRequest.getEmail());
        user.setPassword(registrationRequest.getPassword());
        user.setFullName(registrationRequest.getFullName());
        return userRepository.save(user);
    }
}
