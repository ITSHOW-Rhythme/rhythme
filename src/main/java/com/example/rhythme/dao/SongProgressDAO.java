package com.example.rhythme.dao;

import com.example.rhythme.dto.SongProgressDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SongProgressDAO {
    int updateProgress(SongProgressDTO dto);
}
