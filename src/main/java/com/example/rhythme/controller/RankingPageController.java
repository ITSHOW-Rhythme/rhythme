package com.example.rhythme.controller;

import com.example.rhythme.dto.RankingDTO;
import com.example.rhythme.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api")
public class RankingPageController {
    @Autowired
    private RankingService rankingService;

    // 특정 노래의 상위 랭킹 리스트 반환
    @GetMapping("/top/{song_id}")
    public List<RankingDTO> loadTopRankingsBySongId(@PathVariable int song_id) {
        return rankingService.loadTopRankingsBySongId(song_id);
    }

    // 특정 사용자의 랭킹 리스트 반환
    @GetMapping("/mylank/{user_id}")
    public List<RankingDTO> loadUserRankings(@PathVariable int user_id) {
        return rankingService.loadUserRankings(user_id);
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveRanking(@RequestBody RankingDTO rankingDTO) {
        try {
            rankingService.saveRanking(rankingDTO);
            return ResponseEntity.ok("랭킹 저장 성공");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("랭킹 저장 실패: " + e.getMessage());
        }
    }
}
