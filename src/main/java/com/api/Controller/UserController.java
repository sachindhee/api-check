package com.api.Controller;


import com.api.Repository.userRepository;
import com.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private userRepository userRepository;

    @PostMapping
    public User createUser(@RequestBody User user){


        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getUser(){
        return userRepository.findAll();
    }

    @GetMapping ("/search")
    public List<User> searchUser(@RequestParam String name, @RequestParam int age){

        return userRepository.findByNameContainingIgnoreCaseAndAge(name,age);
    }
    @GetMapping ("/name")
    public List<User> nameUser(@RequestParam String name){

        return userRepository.findByName(name);
    }




}
