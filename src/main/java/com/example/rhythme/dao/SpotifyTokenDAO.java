package com.example.rhythme.dao;

import com.example.rhythme.dto.SpotifyTokenDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SpotifyTokenDAO {
    void insertToken(SpotifyTokenDTO spotifyTokenDTO);

    SpotifyTokenDTO findTokenByUserId(int userId);

    void updateToken(SpotifyTokenDTO spotifyTokenDTO);

    void upsertToken(SpotifyTokenDTO spotifyTokenDTO);

    void deleteTokenByUserId(int userId);
}
