package com.example.rhythme.dao;

import com.example.rhythme.dto.RankingDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RankingDAO {
    void Ranking(RankingDTO rankingDTO);
    void saveRanking(RankingDTO rankingDTO);

    List<RankingDTO> findTopRankingsBySongId(int songId);

    List<RankingDTO> findMyRankings(int userId);
}
