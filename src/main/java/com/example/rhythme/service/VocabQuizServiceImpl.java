package com.example.rhythme.service;

import com.example.rhythme.dao.VocabQuizDAO;
import com.example.rhythme.dto.VocabQuizDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VocabQuizServiceImpl implements VocabQuizService {

    private final VocabQuizDAO vocabQuizDAO;

    @Autowired
    public VocabQuizServiceImpl(VocabQuizDAO vocabQuizDAO) {
        this.vocabQuizDAO = vocabQuizDAO;
    }

    @Override
    public VocabQuizDTO findQuizBySongId(int songId) {
        return vocabQuizDAO.findQuizBySongId(songId);
    }

}
