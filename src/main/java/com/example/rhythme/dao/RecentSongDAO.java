package com.example.rhythme.dao;

import com.example.rhythme.dto.RecentSongDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecentSongDAO {
    RecentSongDTO findMostRecentSongByUserId(int userId);
}
