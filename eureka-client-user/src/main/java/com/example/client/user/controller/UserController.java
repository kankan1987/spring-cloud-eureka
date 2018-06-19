package com.example.client.user.controller;

import com.example.client.user.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {


    @RequestMapping("info")
    public User getUserInfo(){
        return new User();
    }


}
