import java.util.Scanner;

public class manualTask6 {
    public static void main(String[] args){
        //Создайте число. Определите, является ли число трехзначным. Определите, является
        //ли его последняя цифра семеркой. Определите, является ли число четным.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        sc.close();

        if ((9 >= number / 100) && (number / 100 >= 1)){
            System.out.println("Число " + number + " трехзначное!");
        } else {
            System.out.println("Число " + number + " не трехзначнеое!");
        }

        if (number % 10 == 7){
            System.out.println("Последняя цифра числа " + number + " 7!");
        } else {
            System.out.println("Последняя цифра числа "  + number + " не 7!");
        }

        if (number % 2 == 0) {
            System.out.print("Число " + number + " четное!");
        } else {
            System.out.println("Число " + number + " нечетное!");
        }

    }
}
