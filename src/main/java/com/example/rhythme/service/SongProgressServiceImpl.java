package com.example.rhythme.service;

import com.example.rhythme.dao.SongProgressDAO;
import com.example.rhythme.dto.SongProgressDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongProgressServiceImpl implements SongProgressService {
    private final SongProgressDAO songProgressDAO;

    @Autowired
    public SongProgressServiceImpl(SongProgressDAO songProgressDAO){
        this.songProgressDAO = songProgressDAO;
    }

    @Override
    public boolean updateProgress(SongProgressDTO dto){
        int updatedRows = songProgressDAO.updateProgress(dto);
        return updatedRows == 1;
    }

}
