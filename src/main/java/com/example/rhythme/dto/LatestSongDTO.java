package com.example.rhythme.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class LatestSongDTO {
    private int user_id;
    private int songId;
    private String title;
    private String artist;
    private String audioFile;
    private LocalDateTime lastLearnedAt;
}
