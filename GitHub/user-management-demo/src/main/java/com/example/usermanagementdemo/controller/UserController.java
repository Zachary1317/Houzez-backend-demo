package com.example.usermanagementdemo.controller;


import com.example.usermanagementdemo.dto.UserGetDto;
import com.example.usermanagementdemo.dto.UserPatchDto;
import com.example.usermanagementdemo.dto.UserPostDto;
import com.example.usermanagementdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

//    Register new user
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserGetDto create(@Valid @RequestBody UserPostDto userPostDto){
        return userService.create(userPostDto);
    }

//    Search user
    @GetMapping("/{userId}")
    public UserGetDto get(@PathVariable Long userId){
        return userService.get(userId);
    }

//    update user info
    @PatchMapping("/{userId}")
    public UserGetDto update(@Valid @RequestBody UserPatchDto userPatchDto,@PathVariable Long userId){
        return userService.update(userPatchDto,userId);
    }

//    delete user
    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long userId){
        userService.delete(userId);
    }

}
