package com.example.BookMart.Controller;

import com.example.BookMart.Dtos.UserDTO;
import lombok.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private List<UserDTO> listOfUser = new ArrayList<UserDTO>();

    @PostMapping("/create")
    void createUser(@RequestBody UserDTO user) {
        listOfUser.add(user);

    }

    @GetMapping("/getId")
    UserDTO getUser() {
        return new UserDTO();
    }

    @PutMapping("/updateUser")
    void updateUser() {
    }

    @DeleteMapping("/deleteUser")
    boolean deleteuser() {
        return false;
    }
}
