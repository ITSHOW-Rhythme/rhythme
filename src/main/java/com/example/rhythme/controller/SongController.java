package com.example.rhythme.controller;

import com.example.rhythme.dto.SongDTO;
import com.example.rhythme.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/songs")
public class SongController {
    private final SongService songService;

    @Autowired
    public SongController(SongService songService){
        this.songService = songService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<SongDTO>> loadAllSongs() {
        List<SongDTO> songs = songService.loadAllSongs();
        if (songs.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(songs);
    }
}
