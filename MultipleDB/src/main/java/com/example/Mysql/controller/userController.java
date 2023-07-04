package com.example.Mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mysql.Entities.User;
import com.example.Mysql.repo.UserRepo;

@RestController
public class userController {
    @Autowired
    private UserRepo userRepo;
    @PostMapping("/saveUser")   // this is save User
    public User addUser(@RequestBody User user){
        System.out.println("Call addUser method in the userController.");
     return this.userRepo.save(user);
    }
}
