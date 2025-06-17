    package com.example.rhythme.dto;

    import lombok.Data;

    import java.util.Date;

    @Data
    public class SpotifyTokenDTO {
        private int userId;
        private String accessToken;
        private String refreshToken;
        private Date expiryDate;
    }
