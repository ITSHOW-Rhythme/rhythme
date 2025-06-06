package com.example.rhythme.dto;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class RankingDTO {
    private int Id;
    private String userId;
    private int songId;
    private int rank;
    private int score;
    private int playTime;
    private Timestamp createdAt;
}
