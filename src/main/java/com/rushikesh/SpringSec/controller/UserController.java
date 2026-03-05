package com.rushikesh.SpringSec.controller;

import com.rushikesh.SpringSec.entity.Users;
import com.rushikesh.SpringSec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public Users register(@RequestBody Users user)
    {
        System.err.println("user in controller while regisering: "+user);
        return userService.register(user);
    }

    @PostMapping("/test")
    public String login(@RequestBody Users user)
    {
        System.err.println("user in controller: "+user);
        return userService.verify(user);
    }
}
