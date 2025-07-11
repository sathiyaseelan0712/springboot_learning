package com.example.BookMart.ServiceInterface;

import com.example.BookMart.Dtos.UserDTO;

import java.util.*;

public interface UserServiceInterface {
    public void createUser(UserDTO user);
    public List<UserDTO> getAllUser();
}
