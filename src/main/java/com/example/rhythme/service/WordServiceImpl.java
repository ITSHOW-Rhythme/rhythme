package com.example.rhythme.service;

import org.springframework.stereotype.Service;
import com.example.rhythme.dao.WordDAO;
import com.example.rhythme.dto.WordDTO;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class WordServiceImpl implements WordService {

    private final WordDAO wordDAO;

    public WordServiceImpl(WordDAO wordDAO) {
        this.wordDAO = wordDAO;
    }

    @Override
    public List<WordDTO> getRandomWordGroup() {
        List<WordDTO> allWords = getUniqueWords(); // ✅ 중복 제거된 리스트 사용
        Collections.shuffle(allWords);

        return allWords.stream()
                .limit(3)
                .collect(Collectors.toList());
    }

    @Override
    public List<WordDTO> getRandomWords(int count) {
        List<WordDTO> allWords = getUniqueWords(); // ✅ 중복 제거된 리스트 사용
        Collections.shuffle(allWords);

        return allWords.stream()
                .limit(count)
                .collect(Collectors.toList());
    }

    /**
     * 정답 단어와 오답 단어 2개를 랜덤으로 반환 (총 3개, 중복 없음)
     */
    @Override
    public List<WordDTO> getRandomWordGroupWithCorrect(String correctWord) {
        List<WordDTO> uniqueWords = getUniqueWords();

        // 정답 WordDTO 찾기
        WordDTO correct = uniqueWords.stream()
                .filter(word -> word.getWord().equals(correctWord))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("정답 단어를 찾을 수 없습니다: " + correctWord));

        // 오답 목록 만들기 (정답 제외)
        List<WordDTO> incorrectWords = uniqueWords.stream()
                .filter(word -> !word.getWord().equals(correctWord))
                .collect(Collectors.toList());

        if (incorrectWords.size() < 2) {
            throw new RuntimeException("오답 단어가 부족합니다.");
        }

        // 오답 2개 무작위로 선택
        Collections.shuffle(incorrectWords);
        List<WordDTO> result = new ArrayList<>();
        result.add(correct);
        result.addAll(incorrectWords.subList(0, 2));

        // 전체 선택지 무작위 정렬
        Collections.shuffle(result);

        return result;
    }

    /**
     * ✅ word 기준으로 중복 제거된 단어 리스트 반환
     */
    private List<WordDTO> getUniqueWords() {
        List<WordDTO> allWords = wordDAO.getAllWords();
        return allWords.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toMap(
                                WordDTO::getWord,
                                word -> word,
                                (existing, duplicate) -> existing // 중복 시 기존 값 유지
                        ),
                        map -> new ArrayList<>(map.values())
                ));
    }
}
