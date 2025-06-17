package com.example.rhythme.dao;

import com.example.rhythme.dto.SpotifyTokenDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SpotifyPlaybackDAO {
    // 토큰 저장
    int insertToken(SpotifyTokenDTO spotifyTokenDTO);

    // 사용자 ID로 토큰 조회
    SpotifyTokenDTO findTokenByUserId(@Param("userId") int userId);

    // 토큰 업데이트
    int updateToken(SpotifyTokenDTO spotifyTokenDTO);

    // 토큰 삭제
    int deleteTokenByUserId(@Param("userId") int userId);
}
