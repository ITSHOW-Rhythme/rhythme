package com.example.rhythme.service;

import com.example.rhythme.dao.RecentSongDAO;
import com.example.rhythme.dto.RecentSongDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecentSongServiceImpl implements RecentSongService{

    private final RecentSongDAO recentSongDAO;

    @Autowired
    public RecentSongServiceImpl(RecentSongDAO recentSongDAO) {
        this.recentSongDAO = recentSongDAO;
    }

    @Override
    public RecentSongDTO loadRecentSong(int userId) {
        return recentSongDAO.findMostRecentSongByUserId(userId);
    }
}
