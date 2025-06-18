package com.example.rhythme.service;

import com.example.rhythme.dto.UserDTO;

public interface UserService {
    void signup(UserDTO userDTO);
    boolean login(UserDTO userDTO);

    //username으로 userId 조회하는 메서드
    Integer findUserIdByUsername(String username);
}