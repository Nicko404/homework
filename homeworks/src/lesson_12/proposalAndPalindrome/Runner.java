package lesson_12.proposalAndPalindrome;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

//)Текстовый файл содержит текст. После запуска программы в другой файл
//должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
//предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//слов в предложении, оно попадает в новый файл
public class Runner {
    public static void main(String[] args) {

        ArrayList<String> proposal = new ArrayList<>();
        StringBuffer text = new StringBuffer();

        try (BufferedReader br = new BufferedReader(new FileReader
                ("src/lesson_12/proposalAndPalindrome/files/text.txt"))) {
            String line = br.readLine();

            if (line == null) {
                System.out.println("File is empty");
                return;
            }

            while (line != null) {
                text.append(line + " ");
                line = br.readLine();
            }


        } catch (IOException e) {
            System.out.println("File not found");
        }

        System.out.println(new String(text).replaceAll("[.][\\s]", "."));
        proposal.addAll(Arrays.asList(new String(text).replaceAll
                ("[.][\\s]", ".").split("[.]")));

        try (BufferedWriter bw = new BufferedWriter(new FileWriter
                ("src/lesson_12/proposalAndPalindrome/files/answer.txt"))) {
            for (String str : proposal) {
                if (TextFormated.numberOfWords(str) <= 5 && TextFormated.numberOfWords(str) >= 3) {
                    bw.write(str + ".\n");
                } else if (TextFormated.hasPalindrome(str)) {
                    bw.write(str + ".\n");
                }
            }

        } catch (IOException e) {
            e.getMessage();
        }


    }
}
