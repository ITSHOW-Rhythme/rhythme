package com.example.rhythme.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SongDTO {
    @JsonProperty("songId")
    private int songId;

    private String title;
    private String artist;

    @JsonProperty("audioFile")
    private String audioFile;

    @JsonProperty("imageUrl")
    private String imageUrl;
}
