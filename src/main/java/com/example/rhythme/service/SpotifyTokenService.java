package com.example.rhythme.service;

import com.example.rhythme.dto.SpotifyTokenDTO;

public interface SpotifyTokenService {
    void saveToken(SpotifyTokenDTO spotifyTokenDTO);

    SpotifyTokenDTO getTokenByUserId(int userId);

    void updateToken(SpotifyTokenDTO spotifyTokenDTO);

    void deleteTokenByUserId(int userId);

    void saveOrUpdateToken(SpotifyTokenDTO spotifyTokenDTO);

    void upsertToken(SpotifyTokenDTO spotifyTokenDTO);
}
