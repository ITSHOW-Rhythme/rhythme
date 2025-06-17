package com.example.rhythme.service;

import com.example.rhythme.dao.LatestSongDAO;
import com.example.rhythme.dto.LatestSongDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LatestSongServiceImpl implements LatestSongService {

    private final LatestSongDAO latestSongDAO;

    @Autowired
    public LatestSongServiceImpl(LatestSongDAO latestSongDAO) {
        this.latestSongDAO = latestSongDAO;
    }

    @Override
    public LatestSongDTO loadRecentSong(int userId) {
        return latestSongDAO.findMostRecentSongByUserId(userId);
    }
}
