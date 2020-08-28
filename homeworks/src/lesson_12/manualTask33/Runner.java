package lesson_12.manualTask33;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
//препинания и слов.
public class Runner {
    public static void main(String[] args) {

        StringBuffer text = new StringBuffer();

        try (BufferedReader bis = new BufferedReader(new FileReader("src/lesson_12/manualTask33/read.txt"))) {
            String res = bis.readLine();
            //если файл пустой, выводим соответсвующее сообщении и выходим из метода
            if (res == null) {
                System.out.println("There are no words in the file");
                return;
            }

            while (res != null) {
                text.append(res + " ");
                res = bis.readLine();
            }

        } catch (IOException e) {
            System.out.println("File not found exception");
            return;
        }


        String str = new String(text);
        ArrayList<String> listWords = new ArrayList<>();
        ArrayList<String> listPunctuation = new ArrayList<>();

        listWords.addAll(Arrays.asList(str.replaceAll("[^а-яА-Я ]", "").split("[\\s]")));
        listPunctuation.addAll(Arrays.asList(str.replaceAll("[а-яА-Я ]", "").split("[\\s]")));

        System.out.println(listWords.size() + " Words");
        System.out.println(listPunctuation.get(0).length() + " Punctuation marks");



    }
}
