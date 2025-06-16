package com.example.rhythme.dto;

import lombok.Data;

@Data
public class VocabQuizDTO {
    private int id;
    private int song_id;
    private String sentence;
    private String correct_word;
}
