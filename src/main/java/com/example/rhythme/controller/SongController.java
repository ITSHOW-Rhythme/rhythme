package com.example.rhythme.controller;

import com.example.rhythme.dto.SongDTO;
import com.example.rhythme.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    // 전체 노래 목록 조회
    @GetMapping("/all")
    public ResponseEntity<List<SongDTO>> loadAllSongs() {
        List<SongDTO> songs = songService.loadAllSongs();
        if (songs.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(songs);
    }

    // songId로 단일 노래 조회
    @GetMapping("/{songId}")
    public ResponseEntity<SongDTO> getSongById(@PathVariable int songId) {
        SongDTO song = songService.getSongById(songId);
        if (song == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(song);
    }
}
