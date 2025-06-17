package com.example.rhythme.service;

import com.example.rhythme.dao.SpotifyTokenDAO;
import com.example.rhythme.dto.SpotifyTokenDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpotifyTokenServiceImpl implements SpotifyTokenService {

    private final SpotifyTokenDAO spotifyTokenDAO;

    @Autowired
    public SpotifyTokenServiceImpl(SpotifyTokenDAO spotifyTokenDAO){
        this.spotifyTokenDAO = spotifyTokenDAO;
    }

    @Override
    public void saveOrUpdateToken(SpotifyTokenDTO dto) {
        SpotifyTokenDTO existing = spotifyTokenDAO.findTokenByUserId(dto.getUserId());
        if (existing == null) {
            spotifyTokenDAO.insertToken(dto);
        } else {
            spotifyTokenDAO.updateToken(dto);
        }
    }

    @Override
    public void upsertToken(SpotifyTokenDTO dto) {
        spotifyTokenDAO.upsertToken(dto);
    }

    @Override
    public void saveToken(SpotifyTokenDTO spotifyTokenDTO) {
        spotifyTokenDAO.insertToken(spotifyTokenDTO);
    }

    @Override
    public SpotifyTokenDTO getTokenByUserId(int userId) {
        return spotifyTokenDAO.findTokenByUserId(userId);
    }

    @Override
    public void updateToken(SpotifyTokenDTO tokenDTO) {
        spotifyTokenDAO.updateToken(tokenDTO);
    }

    @Override
    public void deleteTokenByUserId(int userId) {
        spotifyTokenDAO.deleteTokenByUserId(userId);
    }


}
