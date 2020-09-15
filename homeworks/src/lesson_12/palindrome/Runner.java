package lesson_12.palindrome;

import java.io.*;
import java.util.ArrayList;

//В исходном файле находятся слова, каждое слово на новой стороке. После
//запуска программы должен создать файл, который будет содержать в себе
//только полиндромы
public class Runner {
    public static void main(String[] atgs) {

        ArrayList<StringBuffer> text = new ArrayList<>();

        try (BufferedReader fr = new BufferedReader(new FileReader("src/lesson_12/palindrome/text.txt"))) {

            String line = fr.readLine();
            if (line == null) {
                System.out.println("There are no words in the file");
                return;
            }
            text.add(new StringBuffer(line));

            //когда в файле закончатся строки, мы получаем исключение и дальше его ловим
            while (true) {
                text.add(new StringBuffer(fr.readLine()));
            }

        } catch (IOException e) {
            System.out.println("File not found");
        } catch (NullPointerException e) {
        }

        try (BufferedWriter fw = new BufferedWriter(new FileWriter("src/lesson_12/palindrome/answer.txt"))) {
            for (StringBuffer line : text) {
                String s1 = line.toString().toLowerCase();
                String s2 = line.reverse().toString().toLowerCase();
                if (s1.equals(s2)) {
                    fw.write(s2 + "\n");
                } else {
                    line.reverse();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
