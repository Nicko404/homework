package lesson_3;

import java.util.Scanner;

public class manualTask12 {
    public static void main(String[] args) {
        //Найдите сумму первых n целых чисел, которые делятся на 3.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt(), sum = 0;
        sc.close();

        int score = 0;
        for (int i = 0; i <= number; i++) {
            sum += score;
            score += 3;
        }

        System.out.println("Сумма первых n(" + number + ") чисел, делящихся на 3 равна " + sum);
    }
}
