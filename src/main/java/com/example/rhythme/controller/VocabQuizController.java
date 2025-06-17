package com.example.rhythme.controller;

import com.example.rhythme.dto.VocabQuizDTO;
import com.example.rhythme.service.VocabQuizService;
import com.example.rhythme.service.VocabQuizServiceImpl;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api")
public class VocabQuizController {

    private final VocabQuizService vocabQuizService;

    public VocabQuizController(VocabQuizService vocabQuizService){
        this.vocabQuizService = vocabQuizService;
    }

    @GetMapping("/vocab-quiz/{songId}")
    public VocabQuizDTO findQuiz(@PathVariable int songId) {
        return vocabQuizService.findQuizBySongId(songId);
    }


}