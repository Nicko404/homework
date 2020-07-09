import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        //Одноклеточная амеба каждые 3 часа делится на 2 клетки.
        //Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите кол-во часов: ");
        int hour = sc.nextInt(), amoebae = 1;
        sc.close();

        for (int i = 3; i <= hour; i += 3){
            amoebae *= 2;
        }

        System.out.println("Кол-во амёб: " + amoebae);
    }
}
