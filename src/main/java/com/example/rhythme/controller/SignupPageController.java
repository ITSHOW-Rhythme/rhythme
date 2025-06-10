package com.example.rhythme.controller;

import com.example.rhythme.dto.UserDTO;
import com.example.rhythme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class SignupPageController {

    @Autowired
    private UserService userService;

    @PostMapping("/sign_up")
    public ResponseEntity<String> signup(@RequestBody UserDTO userDTO) {
        try {
            userService.signup(userDTO);
            return ResponseEntity.ok("회원가입 성공");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("회원가입 실패: " + e.getMessage());
        }
    }
}
