import java.util.Scanner;

public class manualTask12 {
    public static void main(String[] args){
        //Найдите сумму первых n целых чисел, которые делятся на 3.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt(), sum = 0;
        sc.close();

        for (int i = 0; i <= number; i++){
            if (i % 3 == 0) {
                sum += i;
            }
        }

        System.out.println("Сумма чисел кратных 3-м до " + number + " равна " + sum);
    }
}
