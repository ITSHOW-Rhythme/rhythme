package com.example.rhythme.dao;

import com.example.rhythme.dto.LatestSongDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LatestSongDAO {
    LatestSongDTO findMostRecentSongByUserId(int userId);
}
