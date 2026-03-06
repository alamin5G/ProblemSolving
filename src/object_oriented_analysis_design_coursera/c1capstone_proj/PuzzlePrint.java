package object_oriented_analysis_design_coursera.c1capstone_proj;

import java.util.ArrayList;

public class PuzzlePrint {

    // constructor for PuzzlePrint

    public PuzzlePrint() {
    }

    // printPuzzle(ArrayList tokens, ArrayList clues, ArrayList answers)
    // This method should print the puzzle in a readable format, including the tokens, clues, and answers.

    public void printPuzzle(ArrayList<String> tokens, ArrayList<String> clues, ArrayList<String> answers) {
        System.out.println("Six Little Words");

        // Print Tokens
        System.out.println("\nTokens");

        int count = 0;

        for (String token : tokens) {
            System.out.print(token + "\t");
            count++;
            if(count %4 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n");

        // Print Clues
        System.out.println("Clues");

        for (String clue : clues) {
            System.out.println(clue);
        }

        // Print Answer Key
        System.out.println("\nAnswer Key");

        for (String word : answers) {
            System.out.println(word);
        }
    }

}
