package com.example.rhythme.controller;

import com.example.rhythme.dto.LatestSongDTO;
import com.example.rhythme.service.CurrentSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api/users")
public class CurrentSongController {
    private final CurrentSongService currentSongService;

    @Autowired
    public CurrentSongController(CurrentSongService currentSongService){
        this.currentSongService = currentSongService;
    }

    @GetMapping("/{userId}/current-song")
    public ResponseEntity<LatestSongDTO> getCurrentSong(@PathVariable int userId) {
        LatestSongDTO currentSong = currentSongService.loadCurrentSong(userId);
        if (currentSong == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(currentSong);
    }

}
