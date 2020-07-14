package lesson_2;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args){
        //задание №1 с папки homework
        /*В переменную записываем число. Надо вывести на экран сколько
          в этом числе цифр и положительное оно или отрицательное.
          Например, "это однозначное положительное число". Достаточно будет определить,
          является личисло однозначным, "двухзначным или трехзначным и более
         */
        System.out.print("Введите число: ");
        Scanner numScan = new Scanner(System.in);
        int number = numScan.nextInt();
        String answer = "Это ";

        boolean positiveNumber = number > 0;
        boolean isZero = number == 0;
        boolean digit = number / 10 == 0;
        boolean twoDigit = number / 100 == 0;
        boolean threeDigit = number / 1000 == 0;

        if (isZero) {
            answer += "ноль";
        } else {
            if (positiveNumber) {
                answer += "положительное ";
            } else {
                answer += "отрицательное ";
            }

            if (digit) {
             answer += "однозначное число";
            } else if (twoDigit){
                answer += "двухзначное число";
            } else if (threeDigit) {
                answer += "трехзначное число";
            } else {
                answer += "многозначное число";
            }
        }

        System.out.println(answer);
    }
}
