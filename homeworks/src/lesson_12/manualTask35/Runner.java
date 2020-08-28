package lesson_12.manualTask35;

import java.io.*;

//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
//распечатать числа и их среднее арифметическое.
public class Runner {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream("src/lesson_12/manualTask35/file.dat")))) {
            int number = 0;
            for (int i = 0; i <= 20; i++) {
                number = (int) (Math.random() * 100);
                dos.writeInt(number);
            }

        } catch (IOException ex) {
            System.out.println("File not found exception");
            return;
        }

        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(
                new FileInputStream("src/lesson_12/manualTask35/file.dat")))) {
            int res = dis.readInt(), average = 0;
            while (true) {
                System.out.print(res + "\t");
                average += res;

                try {
                    res = dis.readInt();
                } catch (EOFException e) {
                    break;
                }
            }
            System.out.println("\nThe arithmetic mean: " + (double) average / 20);

        } catch (IOException ex) {
            System.out.println("File not found exception");
            return;
        }

    }
}
