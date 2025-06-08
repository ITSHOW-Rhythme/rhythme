package com.example.rhythme.service;

import com.example.rhythme.dto.RecentSongDTO;

public interface RecentSongService {
    RecentSongDTO loadRecentSong(int userId);
}
