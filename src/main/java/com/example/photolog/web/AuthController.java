package com.example.photolog.web;

import com.example.photolog.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller // 1. IOC 2 .파일 리턴
@RequiredArgsConstructor // final 필드를  다 DI 해줌
public class AuthController

{

    private final AuthService authService ;

    @GetMapping("/auth/signin")
    public String signinForm(){
        return "/auth/signin";
    }


    @GetMapping("/auth/signup")
    public String signupForm(){
        return "/auth/signup";
    }


//    @PostMapping ("/auth/signup")
//    public String signupForm(){
//        return "/auth/signin";
//    }

}
