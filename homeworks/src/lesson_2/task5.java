package lesson_2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        //задание 5 из методички
        /*Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
          различны?
        */
        System.out.print("Введите 4-х значное число: ");
        Scanner numScan = new Scanner(System.in);
        int number = numScan.nextInt();
        int num1, num2, num3, num4;

        num1 = number / 1000;
        num2 = (number % 1000) / 100;
        num3 = (number % 100) / 10;
        num4 = number % 10;

        boolean condition1 = (num1 != num2) && (num1 != num3) && (num1 != num4);
        boolean condition2 = (num2 != num3) && (num2 != num4) && (num3 != num4);
        boolean answer = condition1 && condition2;

        System.out.println(answer);

    }
}
