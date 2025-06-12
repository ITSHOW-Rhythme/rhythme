package com.example.rhythme.controller;

import com.example.rhythme.dto.LatestSongDTO;
import com.example.rhythme.service.LatestSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api/recent")
public class LatestSongController {
    private final LatestSongService recentSongService;

    @Autowired
    public LatestSongController(LatestSongService recentSongService){
        this.recentSongService = recentSongService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<LatestSongDTO> loadRecentSong(@PathVariable int userId){
        LatestSongDTO recentSong = recentSongService.loadRecentSong(userId);
        if (recentSong == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recentSong);
    }

    //가잗 최근 학습한 노래 1개 조회

}
