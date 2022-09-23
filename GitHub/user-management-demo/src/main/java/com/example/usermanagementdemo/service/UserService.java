package com.example.usermanagementdemo.service;

import com.example.usermanagementdemo.dto.UserGetDto;
import com.example.usermanagementdemo.dto.UserPatchDto;
import com.example.usermanagementdemo.dto.UserPostDto;
import com.example.usermanagementdemo.exception.ResourceNotFoundException;
import com.example.usermanagementdemo.mapper.UserMapper;
import com.example.usermanagementdemo.model.User;
import com.example.usermanagementdemo.userRepo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.mapstruct.Mapper;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;
    private final UserMapper userMapper;
    public UserGetDto create(UserPostDto userPostDto) {
        return userMapper.userToUserGetDto(userRepo.save(userMapper.userPostDtoToUser(userPostDto)));
    }

    public UserGetDto get(Long userId) {
        return userMapper.userToUserGetDto(find(userId));
    }

    public User find(Long userId){
        return userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("user",userId));
    }

    public UserGetDto update(UserPatchDto userPatchDto, Long userId) {
        User user = find(userId);
        user.setName(userPatchDto.getName());
        user.setEmail(userPatchDto.getEmail());
        return userMapper.userToUserGetDto(userRepo.save(user));
    }

    public void delete(Long userId) {
        userRepo.deleteById(userId);
    }
}
