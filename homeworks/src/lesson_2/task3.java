package lesson_2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        //задание №3 с методички
        /*Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
            А) минут + секунд,
            В) часов + минут + секунд,
            С) дней + часов + минут + секунд,
            D) недель + дней + часов + минут + секунд.
         */
        System.out.print("Введите количество секунд: ");
        Scanner secScan = new Scanner(System.in);

        int s = secScan.nextInt();
        int sec = s % 60;
        int min = (s % 3600) / 60;
        int h = (s / 3600);
        int d = (s / 86400);
        int w = (s / 604800);

        System.out.println("Answer A): " + min  + "m:" + sec + "s");
        System.out.println("Answer B): " + h + "h:" + min + "m:" + sec + "s");
        System.out.println("Answer C): " + d + "d:" + h + "h:" + min + "m:" + sec + "s");
        System.out.println("Answer D): " + w + "w:" + d + "d:" + h + "h:" + min + "m:" + sec + "s");

    }
}
