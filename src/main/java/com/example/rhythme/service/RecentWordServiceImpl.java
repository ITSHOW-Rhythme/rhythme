package com.example.rhythme.service;

import com.example.rhythme.dao.RecentWordDAO;
import com.example.rhythme.dto.RecentWordDTO;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecentWordServiceImpl implements RecentWordService{

    private final RecentWordDAO recentWordDAO;

    @Autowired
    public RecentWordServiceImpl(RecentWordDAO recentWordDAO) {
        this.recentWordDAO = recentWordDAO;
    }

    @Override
    public List<RecentWordDTO> loadRecentWords(String userId) {
        return recentWordDAO.findRecentWordsByUserId(userId);
    }
}
