package com.example.rhythme.service;

import com.example.rhythme.dto.VocabQuizDTO;
import java.util.List;

public interface VocabQuizService {
    List<VocabQuizDTO> findQuizzesBySongId(int songId);
}
