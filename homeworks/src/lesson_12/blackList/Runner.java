package lesson_12.blackList;

import java.util.ArrayList;
import java.io.*;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        ArrayList<String> property = new ArrayList<>();
        ArrayList<String> blackWordsList = new ArrayList<>();

        StringBuffer text = new StringBuffer();
        StringBuffer blackWords = new StringBuffer();

        try (BufferedReader fr = new BufferedReader(new FileReader
                ("src/lesson_12/blackList/files/text.txt"));
             BufferedReader br = new BufferedReader(new FileReader
                     ("src/lesson_12/blackList/files/blackList.txt"))) {


            String line = fr.readLine();

            if (line == null) {
                System.out.println("File is empty");
                return;
            }

            while (line != null) {
                text.append(line + " ");
                line = fr.readLine();
            }
            line = br.readLine();

            while (line != null) {
                blackWords.append(line + " ");
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }

        blackWordsList.addAll(Arrays.asList(blackWords.toString().toLowerCase().split("[\\s]")));
        property.addAll(Arrays.asList(text.toString().replaceAll("[.][\\s]", ".")
                .toLowerCase().split("[.]")));
        ArrayList<String> answer = new ArrayList<>();
        int counter = 0;

        for (String strText : property) {
            for (String strBlackWord : blackWordsList) {
                if (strText.contains(strBlackWord)) {
                    answer.add(strText);
                    counter++;
                }
            }
        }

        if (answer.isEmpty()) {
            System.out.println("Your text has passed the test");
        } else {
            System.out.println("Offers that didn't pass verification: " + counter);
            for (String str : answer) {
                System.out.println(str);
            }
        }

    }
}
