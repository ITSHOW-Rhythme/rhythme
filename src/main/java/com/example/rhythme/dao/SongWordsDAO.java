package com.example.rhythme.dao;

import com.example.rhythme.dto.SongWordSegmentDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SongWordsDAO {
    SongWordSegmentDTO selectSegmentBySongIdAndWordId(@Param("songId") int songId, @Param("wordId") int wordId);
}

