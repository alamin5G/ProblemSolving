package object_oriented_analysis_design_coursera.c1capstone_proj;

import java.util.ArrayList;

public class Puzzle {

    public static void main(String[] args) {


        // Create Reader instance and submit words and clues
            Reader reader = new Reader();

            reader.submit("printer", "device made to waste ink");
            reader.submit("elephant", "large animal with trunk");
            reader.submit("guitar", "musical instrument");
            reader.submit("umbrella", "protection from rain");
            reader.submit("computer", "high speed calculator");
            reader.submit("penguin", "flightless bird");


        // Get words and clues from Reader
            ArrayList<String> words = reader.getWords();
            ArrayList<String> clues = reader.getClues();

        // Create Tokenizer instance and get tokens
            Tokenizer tokenizer = new Tokenizer();
            ArrayList<String> tokens = tokenizer.getTokens(words);

        // Create PuzzlePrint instance and print the puzzle
            PuzzlePrint puzzlePrint = new PuzzlePrint();
            puzzlePrint.printPuzzle(tokens, clues, words);



    }
}
