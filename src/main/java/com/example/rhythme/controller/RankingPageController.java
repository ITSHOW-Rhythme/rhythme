package com.example.rhythme.controller;

import com.example.rhythme.dto.RankingDTO;
import com.example.rhythme.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api/rankings")
public class RankingPageController {
    @Autowired
    private RankingService rankingService;

    // 특정 노래의 상위 랭킹 리스트 반환
    @GetMapping("/top/{songId}")
    public List<RankingDTO> loadTopRankingsBySongId(@PathVariable int songId) {
        return rankingService.loadTopRankingsBySongId(songId);
    }

    // 특정 사용자의 랭킹 리스트 반환
    @GetMapping("/my/{userId}")
    public List<RankingDTO> loadUserRankings(@PathVariable int userId) {
        return rankingService.loadUserRankings(userId);
    }
}
