package lesson_12.proposalAndPalindrome;

import java.util.ArrayList;
import java.util.Arrays;

public class TextFormated {
    public static int numberOfWords(String text) {
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList(text.split("[\\s]")));

        return words.size();
    }

    public static boolean hasPalindrome(String text) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(text.split("[\\s]")));
        String word, word2;

        for (int i = 0; i < words.size(); i++) {
            word = new String(new StringBuffer(words.get(i)).reverse()).toLowerCase();
            word2 = words.get(i).toLowerCase();

            if (word.equals(word2) && words.get(i).length() > 1) {
                return true;
            }
        }
        return false;
    }
}
