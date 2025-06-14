package com.example.rhythme.dto;

import lombok.Data;

@Data
public class AllSongDTO {
    private Integer song_id;
    private String title;
    private String artist;
    private String imageUrl;                // 프론트 이미지 URL 필드명과 일치
    private Integer progress;               // 학습 진행도에 사용
}
