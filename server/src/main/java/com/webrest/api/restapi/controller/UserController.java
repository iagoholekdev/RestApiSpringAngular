package com.webrest.api.restapi.controller;

import com.webrest.api.restapi.model.UserModel;
import com.webrest.api.restapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

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
