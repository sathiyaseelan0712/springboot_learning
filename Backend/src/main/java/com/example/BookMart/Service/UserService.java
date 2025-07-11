package com.example.BookMart.Service;

import com.example.BookMart.Dtos.UserDTO;
import com.example.BookMart.ServiceInterface.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService implements UserServiceInterface {
    List<UserDTO> listOfUser = new ArrayList<>();

    public void createUser(UserDTO user) {
        listOfUser.add(user);
    }

    public List<UserDTO> getAllUser() {
        return listOfUser;
    }
}
