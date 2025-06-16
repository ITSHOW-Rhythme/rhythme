package com.example.rhythme.service;

import com.example.rhythme.dao.AllSongDAO;
import com.example.rhythme.dto.SongDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllSongServiceImpl implements AllSongService {
    private final AllSongDAO songDAO;

    @Autowired
    public AllSongServiceImpl(AllSongDAO songDAO) {
        this.songDAO = songDAO;
    }

    @Override
    public List<SongDTO> loadAllSongs() {
        return songDAO.findAllSongs();
    }

}
