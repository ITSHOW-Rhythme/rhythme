package com.example.rhythme.dao;

import com.example.rhythme.dto.VocabQuizDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VocabQuizDAO {
    VocabQuizDTO findQuizBySongId(@Param("songId") int songId);
}
