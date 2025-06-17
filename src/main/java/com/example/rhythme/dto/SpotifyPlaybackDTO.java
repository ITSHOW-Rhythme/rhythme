package com.example.rhythme.dto;

import lombok.Data;

@Data
public class SpotifyPlaybackDTO {
    private String trackUri;            //특정 곡을 식별하는 고유 주소(URI)
    private int positionMs;             //재생 위치, 밀리초 단위
}
