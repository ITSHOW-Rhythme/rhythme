package com.example.rhythme.dao;

import com.example.rhythme.dto.VocabQuizDTO;
import java.util.List;

public interface VocabQuizDAO {
    List<VocabQuizDTO> findBySongId(int songId);
}

