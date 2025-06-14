package com.example.rhythme.service;

import com.example.rhythme.dao.RankingDAO;
import com.example.rhythme.dao.UserDAO;
import com.example.rhythme.dto.RankingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankingServiceImpl implements RankingService {

    private final RankingDAO rankingDAO;

    @Autowired
    public RankingServiceImpl(RankingDAO rankingDAO) {
        this.rankingDAO = rankingDAO;
    }

    @Override
    public List<RankingDTO> loadTopRankingsBySongId (int songId) {
        return rankingDAO.findTopRankingsBySongId(songId);
    }

    @Override
    public List<RankingDTO> loadUserRankings(int userId) {
        return rankingDAO.findMyRankings(userId);
    }

    @Override
    public void saveRanking(RankingDTO rankingDTO) {
        rankingDAO.Ranking(rankingDTO);
    }
}
