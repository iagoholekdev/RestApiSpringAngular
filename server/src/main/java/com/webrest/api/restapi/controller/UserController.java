package com.webrest.api.restapi.controller;

import com.webrest.api.restapi.model.UserModel;
import com.webrest.api.restapi.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    @RequestMapping("/user/getUser")
    public List<UserModel> List() {
        return userRepository.findAll();
    }
    @PostMapping
    @RequestMapping("/user/insertUser")
    @ResponseStatus(HttpStatus.CREATED)
    public UserModel addUser(@RequestBody UserModel userModel) {
        return userRepository.save(userModel);
    }


}
