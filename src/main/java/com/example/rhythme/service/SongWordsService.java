package com.example.rhythme.service;

import com.example.rhythme.dto.SongWordSegmentDTO;

public interface SongWordsService {
    SongWordSegmentDTO getSegment(int songId, int wordId);
}
