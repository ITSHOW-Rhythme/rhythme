package com.example.rhythme.service;

import com.example.rhythme.dao.VocabQuizDAO;
import com.example.rhythme.dto.VocabQuizDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VocabQuizServiceImpl implements VocabQuizService {

    private final VocabQuizDAO vocabQuizDAO;

    public VocabQuizServiceImpl(VocabQuizDAO vocabQuizDAO) {
        this.vocabQuizDAO = vocabQuizDAO;
    }

    @Override
    public List<VocabQuizDTO> findQuizzesBySongId(int songId) {
        return vocabQuizDAO.findBySongId(songId);
    }
}
