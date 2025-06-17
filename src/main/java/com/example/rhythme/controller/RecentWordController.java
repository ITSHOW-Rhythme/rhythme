package com.example.rhythme.controller;

import com.example.rhythme.dto.RecentWordDTO;
import com.example.rhythme.service.RecentWordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api/recent-words")
public class RecentWordController {

    private final RecentWordService recentWordService;

    public RecentWordController(RecentWordService recentWordService) {
        this.recentWordService = recentWordService;
    }

    @GetMapping("/{userId}")
    public List<RecentWordDTO> getRecentWords(@PathVariable String userId) {
        return recentWordService.loadRecentWords(userId);
    }

}
