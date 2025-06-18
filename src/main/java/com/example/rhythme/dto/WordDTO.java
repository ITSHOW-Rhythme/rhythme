package com.example.rhythme.dto;

import java.util.Objects;

public class WordDTO {
    private int id;
    private String word;
    private String meaning;

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WordDTO)) return false;
        WordDTO that = (WordDTO) o;
        return word != null && word.equals(that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }

}
