package com.example.renewal.service.user.inter;

import com.example.renewal.models.dto.UserRegistrationRequest;
import com.example.renewal.models.entity.user.User;


public interface UserServiceInter {
    User registerUser(UserRegistrationRequest registrationRequest);
}
