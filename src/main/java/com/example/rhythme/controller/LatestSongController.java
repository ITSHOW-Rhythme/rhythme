package com.example.rhythme.controller;

import com.example.rhythme.dto.LatestSongDTO;
import com.example.rhythme.dto.UserDTO;
import com.example.rhythme.service.LatestSongService;
import com.example.rhythme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api/users")
public class LatestSongController {

    private final LatestSongService latestSongService;
    private final UserService userService;

    @Autowired
    public LatestSongController(LatestSongService latestSongService, UserService userService){
        this.latestSongService = latestSongService;
        this.userService = userService;
    }

    //가장 최근 학습한 노래 1개 조회
    @GetMapping("/{username}/latest-song")
    public ResponseEntity<LatestSongDTO> loadCurrentSong(@PathVariable String username){
        Integer userId = userService.findUserIdByUsername(username);
        System.out.println(username);
        LatestSongDTO currentSong = latestSongService.loadRecentSong(userId);
        if (currentSong == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(currentSong);
    }

    // 학습 기록 저장 (userId 기반)
//    @PostMapping("/{userId}/latest-song")
//    public ResponseEntity<Void> saveLearnedSong(@PathVariable int userId, @RequestBody LatestSongDTO dto) {
//        if (dto.getSongId() == 0) {
//            return ResponseEntity.badRequest().build();
//        }
//
//        latestSongService.saveUserSongHistory(userId, dto.getSongId());
//        return ResponseEntity.ok().build();
//    }

    // 학습 기록 저장 (username 기반)
    @PostMapping("/{username}/latest-song")
    public ResponseEntity<Void> saveLearnedSongByUsername(@PathVariable String username, @RequestBody LatestSongDTO dto) {
        if (dto.getSongId() == 0) {
            return ResponseEntity.badRequest().build();
        }

        //System.out.println(username);
        System.out.println(dto);
        Integer userId = userService.findUserIdByUsername(username);
        if (userId == null) {
            return ResponseEntity.notFound().build();
        }

        latestSongService.saveUserSongHistory(userId, dto.getSongId());
        return ResponseEntity.ok().build();
    }

}
