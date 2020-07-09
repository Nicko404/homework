import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        //задание №4 с методички
        /*Определить число, полученное выписыванием в обратном порядке цифр
          любого 4-х значного натурального числа n.
        */
        System.out.print("Введите 4-х значное число: ");
        Scanner numScan = new Scanner(System.in);

        int number = numScan.nextInt();
        int n1, n10, n100, n1000;

        n1 = number % 10;
        n10 = (number % 100) / 10;
        n100 = (number / 100) % 10;
        n1000 = number / 1000;
        int answer = (n1 * 1000) + (n10 * 100) + (n100 * 10) + n1000;

        System.out.println(answer);

    }
}
