package com.example.rhythme.controller;

import com.example.rhythme.dto.SpotifyTokenDTO;
import com.example.rhythme.service.SpotifyTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api/tokens")
public class SpotifyController {
    private final SpotifyTokenService spotifyTokenService;

    @Autowired
    public SpotifyController(SpotifyTokenService spotifyTokenService) {
        this.spotifyTokenService = spotifyTokenService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveToken(@RequestBody SpotifyTokenDTO dto) {
        try {
            spotifyTokenService.saveToken(dto);
            return ResponseEntity.ok("토큰 저장 성공");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("토큰 저장 실패: " + e.getMessage());
        }
    }

    @PostMapping("/saveOrUpdate")
    public ResponseEntity<String> saveOrUpdateToken(@RequestBody SpotifyTokenDTO dto) {
        spotifyTokenService.saveOrUpdateToken(dto);
        return ResponseEntity.ok("토큰 저장 또는 업데이트 성공");
    }

    @PostMapping("/upsert")
    public ResponseEntity<String> upsertToken(@RequestBody SpotifyTokenDTO dto) {
        spotifyTokenService.upsertToken(dto);
        return ResponseEntity.ok("토큰 저장 또는 업데이트 성공");
    }

    @GetMapping("/{userId}")
    public ResponseEntity<SpotifyTokenDTO> getToken(@PathVariable int userId) {
        SpotifyTokenDTO token = spotifyTokenService.getTokenByUserId(userId);
        if(token == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(token);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateToken(@RequestBody SpotifyTokenDTO spotifyTokenDTO) {
        spotifyTokenService.updateToken(spotifyTokenDTO);
        return ResponseEntity.ok("토큰 업데이트 성공");
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteToken(@PathVariable int userId) {
        spotifyTokenService.deleteTokenByUserId(userId);
        return ResponseEntity.ok("토큰 삭제 성공");
    }
}
