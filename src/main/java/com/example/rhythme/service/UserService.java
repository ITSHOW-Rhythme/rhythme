package com.example.rhythme.service;

import com.example.rhythme.dto.UserDTO;

public interface UserService {
    void signup(UserDTO userDTO);
    boolean login(UserDTO userDTO);
}