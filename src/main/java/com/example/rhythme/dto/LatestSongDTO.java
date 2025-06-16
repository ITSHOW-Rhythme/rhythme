package com.example.rhythme.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class LatestSongDTO {
    private int id;
    private int user_id;
    private int song_id;
    private Timestamp last_learned_at;
}
