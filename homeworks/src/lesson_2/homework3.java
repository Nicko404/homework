package lesson_2;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args){
        //задание №3 с папки homework
        /*Дано целое число. Если оно является положительным,
          то прибавить к нему 1.Если отрицательным, то вычесть из него 2.
          Если нулевым, то заменить его на 10. Вывести полученное число
        */

        System.out.print("Введите число: ");
        Scanner numScan = new Scanner(System.in);
        int number = numScan.nextInt();

        boolean isPositive = number > 0;
        boolean zero = number == 0;

        if (zero) {
            number = 10;
        } else if (isPositive){
            number++;
        } else {
            number -= 2;
        }

        System.out.println(number);
    }
}
