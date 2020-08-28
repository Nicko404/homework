package lesson_12.manualTask34;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
//распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
//распечатать.
public class Runner {
    public static void main(String[] args) {

        StringBuffer text = new StringBuffer();

        try (BufferedReader br = new BufferedReader(new FileReader("src/lesson_12/manualTask34/file.txt"))) {

            String line = br.readLine();

            if (line == null) {
                System.out.println("There are no words in the file");
                return;
            }

            while (line != null) {
                text.append(line + " ");
                line = br.readLine();
            }

        } catch (IOException ex) {
            System.out.println("File not found exception");
            return;
        }

        String str = new String(text);
        ArrayList<String> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(str.replaceAll("[^0-9 ]", "").split("[\\s]")));

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals("")) {
                numbers.remove(i);
                i--;
            }
        }

        int result = 0;
        for (int i = 0; i < numbers.size(); i++) {
            result += Integer.parseInt(numbers.get(i));
        }
        HashSet<String> hSet = new HashSet<>(numbers);

        System.out.println("Sum of all numbers in the file: " + result);
        System.out.println("Unique numbers in the file: " + hSet);
    }
}
