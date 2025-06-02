package com.example.rhythme.dao;

import com.example.rhythme.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    void signup(UserDTO userDTO);

    UserDTO findByUsername(String username);
}
