package com.example.rhythme.controller;

import com.example.rhythme.dto.RecentSongDTO;
import com.example.rhythme.service.RankingService;
import com.example.rhythme.service.RecentSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api/recent")
public class RecentSongController {
    private final RecentSongService recentSongService;

    @Autowired
    public RecentSongController(RecentSongService recentSongService){
        this.recentSongService = recentSongService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<RecentSongDTO> loadRecentSong(@PathVariable int userId){
        RecentSongDTO recentSong = recentSongService.loadRecentSong(userId);
        if (recentSong == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(recentSong);
    }

}
