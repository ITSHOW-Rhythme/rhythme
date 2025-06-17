package com.example.rhythme.controller;

import com.example.rhythme.dto.WordDTO;
import com.example.rhythme.service.WordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/words")
public class WordController {

    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping("/group")
    public List<WordDTO> getRandomWordGroup() {
        return wordService.getRandomWordGroup();
    }

}
