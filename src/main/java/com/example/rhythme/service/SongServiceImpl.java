package com.example.rhythme.service;

import com.example.rhythme.dao.SongDAO;
import com.example.rhythme.dto.SongDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    private final SongDAO songDAO;

    @Autowired
    public SongServiceImpl(SongDAO songDAO) {
        this.songDAO = songDAO;
    }

    @Override
    public List<SongDTO> loadAllSongs() {
        return songDAO.findAllSongs();
    }

    @Override
    public SongDTO getSongById(int songId) {
        return songDAO.findSongById(songId);
    }
}
