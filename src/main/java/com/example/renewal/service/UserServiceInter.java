package com.example.renewal.service;

import com.example.renewal.models.dto.UserRegistrationRequest;
import com.example.renewal.models.entity.User;
import org.springframework.stereotype.Service;


public interface UserServiceInter {
    User registerUser(UserRegistrationRequest registrationRequest);
}
