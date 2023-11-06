package org.example.problem_A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * todo Document type Line
 */
public class Line {
    private String text;

    public Line(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public List<String> getWords() {
        String[] words = text.split("\\s+");
        List<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, words);
        return wordList;
    }
}
