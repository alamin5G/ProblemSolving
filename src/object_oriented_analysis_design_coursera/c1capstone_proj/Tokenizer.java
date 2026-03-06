package object_oriented_analysis_design_coursera.c1capstone_proj;

import java.util.ArrayList;
import java.util.Collections;

public class Tokenizer {

    public ArrayList<String> getTokens(ArrayList<String> words) {

        ArrayList<String> tokens = new ArrayList<>();

        for (String word : words) {

            int i = 0;

            while (i < word.length()) {

                if (word.length() - i == 3) {
                    tokens.add(word.substring(i, i + 3));
                    break;
                } else {
                    tokens.add(word.substring(i, Math.min(i + 2, word.length())));
                    i += 2;
                }

            }
        }

        Collections.shuffle(tokens);

        return tokens;
    }
}