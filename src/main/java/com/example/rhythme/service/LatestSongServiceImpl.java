package com.example.rhythme.service;

import com.example.rhythme.dao.LatestSongDAO;
import com.example.rhythme.dto.LatestSongDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LatestSongServiceImpl implements LatestSongService {

    private final LatestSongDAO latestSongDAO;

    public LatestSongServiceImpl(LatestSongDAO latestSongDAO) {
        this.latestSongDAO = latestSongDAO;
    }

    @Override
    public LatestSongDTO loadRecentSong(int userId) {
        return latestSongDAO.findMostRecentSongByUserId(userId);
    }

    @Override
    public void saveUserSongHistory(int userId, int songId) {
        latestSongDAO.insertUserSongHistory(userId, songId);
    }

}
