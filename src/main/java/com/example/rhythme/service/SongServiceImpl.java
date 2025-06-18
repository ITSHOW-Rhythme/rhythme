package com.example.rhythme.service;

import com.example.rhythme.dto.SongDTO;
import com.example.rhythme.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SongServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<SongDTO> loadAllSongs() {
        String sql = "SELECT song_id, title, artist, audio_file, imageUrl AS image_url FROM songs";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            SongDTO song = new SongDTO();
            song.setSongId(rs.getInt("song_id"));
            song.setTitle(rs.getString("title"));
            song.setArtist(rs.getString("artist"));
            song.setAudioFile(rs.getString("audio_file"));
            song.setImageUrl(rs.getString("image_url"));
            return song;
        });
    }

    @Override
    public SongDTO getSongById(int songId) {
        String sql = "SELECT song_id, title, artist, audio_file, imageUrl AS image_url FROM songs WHERE song_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{songId}, (rs, rowNum) -> {
            SongDTO song = new SongDTO();
            song.setSongId(rs.getInt("song_id"));
            song.setTitle(rs.getString("title"));
            song.setArtist(rs.getString("artist"));
            song.setAudioFile(rs.getString("audio_file"));
            song.setImageUrl(rs.getString("image_url"));
            return song;
        });
    }
}
