package com.example.rhythme.service;

import com.example.rhythme.dto.WordDTO;
import java.util.List;

public interface WordService {
    List<WordDTO> getRandomWordGroup();
}
