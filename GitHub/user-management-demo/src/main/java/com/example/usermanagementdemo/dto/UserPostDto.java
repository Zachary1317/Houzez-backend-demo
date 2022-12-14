package com.example.usermanagementdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
public class UserPostDto {
    @NotBlank
    @Size(max = 128, message = "Name can not be more than 128 characters.")
    private String name;

    @NotBlank(message = "Email must not be blank.")
    @Size(max = 128, message = "Email name can not be more than 128 characters.")
    @Email(message = "Email should be a valid email.")
    private String email;

    @NotEmpty(message = "Password must not be empty")
    @Pattern(regexp = "^(?=\\S*[a-zA-Z])(?=\\S*[0-9#!\"$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]).{8,}$",
            message = "Your password must be at least 8 character long and contains at least one non-letter character.")
    private String password;
}