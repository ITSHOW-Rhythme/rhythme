package com.example.rhythme.service;

import com.example.rhythme.dto.SongProgressDTO;

public interface SongProgressService {
    boolean updateProgress(SongProgressDTO songProgressDTO);
}
