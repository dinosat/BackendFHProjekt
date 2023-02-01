package com.example.backendfhprojekt.controller;

import com.example.backendfhprojekt.model.User;
import com.example.backendfhprojekt.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService= userService;
    }

    public <S extends User> S save(S entity) {
        return userService.save(entity);
    }

}
