package com.example.rhythme.service;

import com.example.rhythme.dto.SongDTO;

import java.util.List;

public interface SongService {
    List<SongDTO> loadAllSongs();
}
