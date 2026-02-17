package com.orgflow.orgflow.modules.user.controller;

import com.orgflow.orgflow.modules.user.model.User;
import com.orgflow.orgflow.modules.user.service.UserService;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/users")
//@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    
    public UserController(UserService userService) {
    	this.userService=userService ;
    }

    // שליפת כל המשתמשים - GET http://localhost:8080/api/users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // יצירת משתמש חדש - POST http://localhost:8080/api/users
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
    
   
}