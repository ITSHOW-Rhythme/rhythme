package com.example.rhythme.service;

import com.example.rhythme.dto.AllSongDTO;

import java.util.List;

public interface AllSongService {
    List<AllSongDTO> loadAllSongs();
}
