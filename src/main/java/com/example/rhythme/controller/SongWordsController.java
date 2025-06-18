package com.example.rhythme.controller;

import com.example.rhythme.dto.SongWordSegmentDTO;
import com.example.rhythme.service.SongWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/song-words")
public class SongWordsController {

    private final SongWordsService songWordsService;

    @Autowired
    public SongWordsController(SongWordsService songWordsService) {
        this.songWordsService = songWordsService;
    }

    @GetMapping("/segment")
    public ResponseEntity<SongWordSegmentDTO> getSegment(
            @RequestParam("songId") int songId,
            @RequestParam("wordId") int wordId) {

        SongWordSegmentDTO dto = songWordsService.getSegment(songId, wordId);

        if (dto != null) {
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
