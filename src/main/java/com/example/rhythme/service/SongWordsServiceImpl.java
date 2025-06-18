package com.example.rhythme.service;

import com.example.rhythme.dao.SongWordsDAO;
import com.example.rhythme.dto.SongWordSegmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongWordsServiceImpl implements SongWordsService {

    private final SongWordsDAO songWordsDAO;

    @Autowired
    public SongWordsServiceImpl(SongWordsDAO songWordsDAO) {
        this.songWordsDAO = songWordsDAO;
    }

    @Override
    public SongWordSegmentDTO getSegment(int songId, int wordId) {
        return songWordsDAO.selectSegmentBySongIdAndWordId(songId, wordId);
    }
}
