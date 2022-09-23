package com.example.usermanagementdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@AllArgsConstructor
public class UserGetDto {
    private long id;
    private String name;
    private String email;
    private OffsetDateTime createdTime;
    private OffsetDateTime updatedTime;
}
