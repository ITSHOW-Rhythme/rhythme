package com.example.rhythme.service;

import com.example.rhythme.dao.VocabQuizDAO;
import com.example.rhythme.dto.VocabQuizDTO;

public interface VocabQuizService {
    VocabQuizDTO findQuizBySongId(int songId);
}
