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

    @GetMapping("/{userId}/latest-song")
    public ResponseEntity<LatestSongDTO> loadCurrentSong(@PathVariable int userId){
        LatestSongDTO currentSong = latestSongService.loadRecentSong(userId);
        if (currentSong == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(currentSong);
    }
    //가장 최근 학습한 노래 1개 조회

    @PostMapping("/{userId}/latest-song")
    public ResponseEntity<Void> saveLearnedSong(@PathVariable int userId, @RequestBody LatestSongDTO dto) {
        if (dto.getSongId() == 0) {
            return ResponseEntity.badRequest().build();
        }

        latestSongService.saveUserSongHistory(userId, dto.getSongId());
        return ResponseEntity.ok().build();
    }

}
