package com.example.rhythme.dao;

import com.example.rhythme.dto.LatestSongDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;


@Mapper
public interface LatestSongDAO {
    LatestSongDTO findMostRecentSongByUserId(int userId);

    void insertUserSongHistory(@Param("userId") int userId, @Param("songId") int songId);
}
