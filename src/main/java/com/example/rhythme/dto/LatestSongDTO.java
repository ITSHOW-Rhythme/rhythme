package com.example.rhythme.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class LatestSongDTO {
    private int userId;
    private int songId;
    private String title;
    private String artist;
    private String audioFile;
    private Timestamp lastLearnedAt;
}
