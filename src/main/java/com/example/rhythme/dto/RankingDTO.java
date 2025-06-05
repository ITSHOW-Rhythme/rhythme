package com.example.rhythme.dto;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class RankingDTO {
    private int id;
    private String user_id;
    private int song_id;
    private int rank;
    private int score;
    private int play_time;
    private Timestamp created_at;
}
