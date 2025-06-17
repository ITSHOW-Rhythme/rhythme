package com.example.rhythme.controller;

import com.example.rhythme.dto.LatestSongDTO;
import com.example.rhythme.service.LatestSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api/users")
public class LatestSongController {
    private final LatestSongService latestSongService;

    @Autowired
    public LatestSongController(LatestSongService latestSongService){
        this.latestSongService = latestSongService;
    }

    @GetMapping("/{userId}/current-song")
    public ResponseEntity<LatestSongDTO> loadCurrentSong(@PathVariable int userId){
        LatestSongDTO currentSong = latestSongService.loadRecentSong(userId);
        if (currentSong == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(currentSong);
    }

    //가잗 최근 학습한 노래 1개 조회

}
