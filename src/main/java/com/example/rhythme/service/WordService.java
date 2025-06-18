package com.example.rhythme.service;

import com.example.rhythme.dto.WordDTO;
import java.util.List;

public interface WordService {

    // 무작위 단어 3개
    List<WordDTO> getRandomWordGroup();

    // 무작위 단어 N개
    List<WordDTO> getRandomWords(int count);

    // 정답 + 오답 2개 (총 3개 반환) - 중복 없는 퀴즈용 mm
    List<WordDTO> getRandomWordGroupWithCorrect(String correctWord);
}
