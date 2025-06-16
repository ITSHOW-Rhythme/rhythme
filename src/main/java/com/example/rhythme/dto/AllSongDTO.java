package com.example.rhythme.dto;

import lombok.Data;

@Data
<<<<<<< HEAD:src/main/java/com/example/rhythme/dto/SongDTO.java
public class SongDTO {
=======
public class SongDTO {
>>>>>>> f41560bd168787b96c13bcefacc5867ab1a0855d:src/main/java/com/example/rhythme/dto/SongDTO.java
    private Integer song_id;
    private String title;
    private String artist;
    private String imageUrl;                // 프론트 이미지 URL 필드명과 일치
    private Integer progress;               // 학습 진행도에 사용
}
