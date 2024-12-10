package com.amel.usermanagement.DTO.Mapper;

import com.amel.usermanagement.DTO.Request.UserRequest;
import com.amel.usermanagement.DTO.Response.UserResponse;
import com.amel.usermanagement.Model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
    UserModel fromRequestToEntity(UserRequest userRequest);
    UserResponse fromEntityToResponse(UserModel userModel);
}
