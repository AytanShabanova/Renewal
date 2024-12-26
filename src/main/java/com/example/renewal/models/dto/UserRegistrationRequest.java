package com.example.renewal.models.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRegistrationRequest {
    @NotBlank
            @Email
    String email;
    @NotBlank
    @Size(min = 8, message = "Password must be at least 8 characters long")
    String password;
    @NotBlank
    String fullName;


}
