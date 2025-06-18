package com.example.rhythme.service;

import com.example.rhythme.dto.LatestSongDTO;

import java.time.LocalDateTime;

public interface LatestSongService {
    LatestSongDTO loadRecentSong(int userId);

    void saveUserSongHistory(int userId, int songId);
}
