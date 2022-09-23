package com.example.usermanagementdemo.mapper;

import com.example.usermanagementdemo.dto.UserGetDto;
import com.example.usermanagementdemo.dto.UserPostDto;
import com.example.usermanagementdemo.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    User userPostDtoToUser(UserPostDto userPostDto);
    UserGetDto userToUserGetDto(User user);
}
