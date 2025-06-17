package com.example.rhythme.service;

import com.example.rhythme.dto.RecentWordDTO;

import java.util.List;

public interface RecentWordService {
    List<RecentWordDTO> loadRecentWords(String userId);
}
