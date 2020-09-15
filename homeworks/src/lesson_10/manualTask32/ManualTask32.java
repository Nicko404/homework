package lesson_10.manualTask32;

import java.util.HashMap;
import java.util.Map;

//Имеется текст. Следует составить для него частотный словарь.
public class ManualTask32 {
    public static void main(String[] args) {
        String text = "Имеется текст. Следует составить для него частотный словарь.";
        String[] arrayText = text.replaceAll("[^а-яА-яa-zA-Z,]",",").toLowerCase().split(",");


        Map<String, Integer> words = new HashMap<>();

        for (String s : arrayText) {
            if (s.equals("")) {
            } else if (words.containsKey(s)) {
                words.put(s, words.get(s) + 1);
            } else {
                words.put(s, 1);
            }
        }

        System.out.println(words);
    }
}
