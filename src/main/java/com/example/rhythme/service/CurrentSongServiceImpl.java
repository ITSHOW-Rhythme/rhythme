package com.example.rhythme.service;

import com.example.rhythme.dao.CurrentSongDAO;
import com.example.rhythme.dto.LatestSongDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrentSongServiceImpl implements CurrentSongService{

    private final CurrentSongDAO currentSongDAO;

    @Autowired
    public CurrentSongServiceImpl(CurrentSongDAO currentSongDAO){
        this.currentSongDAO = currentSongDAO;
    }

    @Override
    public LatestSongDTO loadCurrentSong(int userId){
        return currentSongDAO.findCurrentSongByUserId(userId);
    }
}
