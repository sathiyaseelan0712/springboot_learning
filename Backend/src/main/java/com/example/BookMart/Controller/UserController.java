package com.example.BookMart.Controller;

import com.example.BookMart.Dtos.UserDTO;
import com.example.BookMart.Service.UserService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    String createUser(@RequestBody UserDTO user) {
        userService.createUser(user);
        return "User created Successfully";

    }

    @GetMapping("/getAll")
    List<UserDTO> getAll() {
        return userService.getAllUser();
    }

//    @GetMapping("/getId")
//    UserDTO getUser() {
//        return new UserDTO();
//    }

//    @PutMapping("/updateUser")
//    void updateUser() {
//    }

//    @DeleteMapping("/deleteUser")
//    boolean deleteuser() {
//        return false;
//    }
}
