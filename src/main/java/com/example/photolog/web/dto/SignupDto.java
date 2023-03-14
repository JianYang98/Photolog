package com.example.photolog.web.dto;

import com.example.photolog.domain.user.User;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class SignupDto {

    @Size(min =2 , max = 20) // 20글짜
    @NotBlank
    private String username ;
    @NotBlank // 공백 x , password 반드시 필요
    private String password;
    @NotBlank
    private String email;
    @NotBlank
    private String name ;

    public User toEntity(){
        return User.builder().username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }

}
