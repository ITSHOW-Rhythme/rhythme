package com.example.rhythme.service;

import com.example.rhythme.dto.RankingDTO;

import java.util.List;

public interface RankingService {
    List<RankingDTO> loadTopRankingsBySongId (int songId);
    List<RankingDTO> loadUserRankings (String userId);

    void saveRanking(RankingDTO rankingDTO);
}