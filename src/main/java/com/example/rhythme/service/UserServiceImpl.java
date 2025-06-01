package com.example.rhythme.service;

import com.example.rhythme.dao.UserDAO;
import com.example.rhythme.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
        this.passwordEncoder = new BCryptPasswordEncoder(); // 직접 생성하거나 @Bean으로 주입
    }

    @Override
    public void signup(UserDTO userDTO) {
        // 비밀번호 암호화
        String encodedPassword = passwordEncoder.encode(userDTO.getPassword());
        userDTO.setPassword(encodedPassword);

        // DB에 저장
        userDAO.signup(userDTO);
    }
}
