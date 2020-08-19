package lesson_10.manualTask32;

import java.util.HashMap;
import java.util.Map;

//Имеется текст. Следует составить для него частотный словарь.
public class ManualTask32 {
    public static void main(String[] args) {
        String text = "Как я понимаю: имеется текст и нужно посчитать " +
                "сколько в нем слов и сколько раз они повторяются, и бла бла бла... " +
                "Допустим, это и есть тот самый текст. А дальше будем импровизировать... " +
                "Наберем еще парочку слов, что бы не было много слов, которые встречаются " +
                "по одному разу, а именно: как, я, нужно, нужно, они, дальше, слов, много, много, " +
                "по, по, повторяются, именно, это, я, я, было, было, много слов" +
                " и бла бла бла... Эх, интересна жизнь программиста!";
        String[] arrayText = text.replaceAll("[^а-яА-я ]","").toLowerCase().split("\\s");

        Map<String, Integer> words = new HashMap<>();

        for (String s : arrayText) {
            if (words.containsKey(s)) {
                words.put(s, words.get(s) + 1);
            } else {
                words.put(s, 1);
            }
        }

        System.out.println(words);
    }
}
