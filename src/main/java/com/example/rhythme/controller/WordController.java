package com.example.rhythme.controller;

import com.example.rhythme.dto.WordDTO;
import com.example.rhythme.service.WordService;
import com.example.rhythme.service.WordServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WordController {

    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping("/words")
    public List<WordDTO> getWords() {
        return wordService.getAllWords();
    }
}
