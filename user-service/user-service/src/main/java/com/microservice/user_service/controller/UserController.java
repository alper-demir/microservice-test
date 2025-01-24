package com.microservice.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping
    public String getUser(){
        return "User";
    }

    @GetMapping("/get")
    public String getUserMessage(){
        return "User";
    }

}
