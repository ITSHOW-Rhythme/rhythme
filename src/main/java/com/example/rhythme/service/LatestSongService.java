package com.example.rhythme.service;

import com.example.rhythme.dto.LatestSongDTO;

public interface LatestSongService {
    LatestSongDTO loadRecentSong(int userId);
}
