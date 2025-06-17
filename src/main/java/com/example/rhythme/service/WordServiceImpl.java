package com.example.rhythme.service;

import com.example.rhythme.dao.WordDAO;
import com.example.rhythme.dto.WordDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WordServiceImpl implements WordService {
    private final WordDAO wordDAO;

    public WordServiceImpl(WordDAO wordDAO) {
        this.wordDAO = wordDAO;
    }

    @Override
    public List<WordDTO> getAllWords() {
        return wordDAO.getAllWords();
    }

    @Override
    public List<WordDTO> getRandomWords(int count) {
        return wordDAO.findRandomWords(count);
    }

}
