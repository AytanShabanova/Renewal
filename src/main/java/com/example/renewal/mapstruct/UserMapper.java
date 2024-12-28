package com.example.renewal.mapstruct;

import com.example.renewal.models.dto.UserRegistrationRequest;
import com.example.renewal.models.entity.user.User;
import org.mapstruct.Mapper;



import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(componentModel = "spring",unmappedTargetPolicy = IGNORE)
public interface UserMapper {


    User userRegistrationRequestToUser(UserRegistrationRequest userRegistrationRequest);
}
