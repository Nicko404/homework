package lesson_2;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        //задание №6 с папки homework
        /*Даны 2 числа. Вывести большее из них
        */

        Scanner numScan = new Scanner(System.in);
        int a, b;

        System.out.print("Введите два числа: ");
        a = numScan.nextInt();
        b = numScan.nextInt();

        if (a > b) {
            System.out.println("Число " + a + " больше чем " + b);
        } else  if (a < b) {
            System.out.println("Число " + b + " больше чем " + a);
        } else {
            System.out.println("Числа " + a + " и " + b + " равны");
        }
    }
}
