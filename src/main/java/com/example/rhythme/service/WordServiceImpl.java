package com.example.rhythme.service;

import org.springframework.stereotype.Service;
import com.example.rhythme.dao.WordDAO;
import com.example.rhythme.dto.WordDTO;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WordServiceImpl implements WordService {

    private final WordDAO wordDAO;

    public WordServiceImpl(WordDAO wordDAO) {
        this.wordDAO = wordDAO;
    }

    @Override
    public List<WordDTO> getRandomWordGroup() {
        List<WordDTO> allWords = wordDAO.getAllWords();
        Collections.shuffle(allWords);

        // 3개씩 묶어서 반환
        return allWords.stream()
                .limit(3)
                .collect(Collectors.toList());
    }

    @Override
    public List<WordDTO> getRandomWords(int count) {
        return wordDAO.findRandomWords(count);
    }

}
