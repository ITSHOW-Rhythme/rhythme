package com.example.rhythme.controller;

import com.example.rhythme.dto.SongProgressDTO;
import com.example.rhythme.service.SongProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api")
public class SongProgressController {

    @Autowired
    private SongProgressService songProgressService;

    @PostMapping("/progress")
    public ResponseEntity<String> updateProgress(@RequestBody SongProgressDTO dto) {
        boolean success = songProgressService.updateProgress(dto);
        if(success) {
            return ResponseEntity.ok("Progress updated successfully");
        } else {
            return ResponseEntity.status(500).body("Failed to update progress");
        }
    }

}
