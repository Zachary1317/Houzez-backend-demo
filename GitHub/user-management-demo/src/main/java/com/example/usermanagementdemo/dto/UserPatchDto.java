package com.example.usermanagementdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserPatchDto {
    @NotBlank
    @Size(max = 128, message = "Name can not be more than 128 characters.")
    private String name;

    @NotBlank(message = "Email must not be blank.")
    @Size(max = 128, message = "Email name can not be more than 128 characters.")
    @Email(message = "Email should be a valid email.")
    private String email;
}
