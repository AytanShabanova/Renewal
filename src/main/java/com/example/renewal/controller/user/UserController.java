package com.example.renewal.controller.user;

import com.example.renewal.models.dto.UserRegistrationRequest;
import com.example.renewal.models.entity.user.User;
import com.example.renewal.service.user.inter.UserServiceInter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceInter userServiceInter;
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserRegistrationRequest userRegistrationRequest){
      User user = userServiceInter.registerUser(userRegistrationRequest);
      return ResponseEntity.ok(user);

    }
}
