package com.example.rhythme.dao;

import com.example.rhythme.dto.AllSongDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AllSongDAO {
    List<AllSongDTO> findAllSongs();
}
