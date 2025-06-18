package com.example.rhythme.dto;

import lombok.Data;

@Data
public class VocabQuizDTO {
    private int wordId;
    private int song_id;
    private String sentence;
    private String correct_word;
    private String meaning; // 추가됨
}

