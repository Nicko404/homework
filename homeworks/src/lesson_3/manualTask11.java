package lesson_3;

import java.util.Scanner;

public class manualTask11 {
    public static void main(String[] args){
        //Имеется целое число, определить является ли это число простым, т.е.
        //делится без остатка только на 1 и себя.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целлое число: ");
        int number = sc.nextInt();
        sc.close();

        boolean isSimpleNumb = true;

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                isSimpleNumb = false;
                break;
            }
        }

        if (isSimpleNumb) {
            System.out.println("Число " + number + " простое!");
        } else {
            System.out.println("Число " + number + " составное!");
        }
    }
}
