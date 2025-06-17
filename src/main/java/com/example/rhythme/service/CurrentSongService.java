package com.example.rhythme.service;

import com.example.rhythme.dto.LatestSongDTO;

public interface CurrentSongService {
    LatestSongDTO loadCurrentSong(int userId);
}
