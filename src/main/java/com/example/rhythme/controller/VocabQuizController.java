package com.example.rhythme.controller;

import com.example.rhythme.dto.VocabQuizDTO;
import com.example.rhythme.service.VocabQuizService;
import com.example.rhythme.service.VocabQuizServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class VocabQuizController {

    private final VocabQuizService vocabQuizService;

    public VocabQuizController(VocabQuizService vocabQuizService) {
        this.vocabQuizService = vocabQuizService;
    }

    @GetMapping("/vocab-quiz/{songId}")
    public List<VocabQuizDTO> findQuizzes(@PathVariable("songId") int song_id) {
        return vocabQuizService.findQuizzesBySongId(song_id);
    }
}
