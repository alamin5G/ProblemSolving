package object_oriented_analysis_design_coursera.c1capstone_proj;

import java.util.ArrayList;

public class Reader {

    private ArrayList<String> words;
    private ArrayList<String> clues;

    public Reader() {
        words = new ArrayList<>();
        clues = new ArrayList<>();
    }

    public int submit(String word, String clue) {

        if (word.length() >= 5) {
            words.add(word.toUpperCase());
            clues.add(clue);
        }

        return words.size();
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public ArrayList<String> getClues() {
        return clues;
    }
}