package model;

import java.util.List;

public class Puzzle {
    private String title;
    private List<Word> words;

    public Puzzle(String title, List<Word> words) {
        this.title = title;
        this.words = words;
    }

    public String getTitle() {
        return title;
    }

    public List<Word> getWords() {
        return words;
    }

    public void addWord(Word word) {
        words.add(word);
    }

    public void removeWord(Word word) {
        words.remove(word);
    }
}