package com.mex.curbyourexpenses.controller;

import com.mex.curbyourexpenses.model.AppUser;
import com.mex.curbyourexpenses.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody AppUser user){
        userService.saveUser(user);
        return "New user is created";
    }

}
