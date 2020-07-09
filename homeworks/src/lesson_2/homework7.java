import java.util.Scanner;

public class homework7 {
    public static void main(String[] atgs) {
        //задание №7 с папки homework
        /*В переменную записываете количество программистов.
          В зависимости от количества программистов необходимо вывести
          правильно окончание. Например: • 2 программиста • 1 программист
          • 10 программистов • и т.д.
        */

        Scanner numScan = new Scanner(System.in);
        System.out.print("Введите колличество программистов: ");
        int number = numScan.nextInt();

        boolean istEnd = number % 10 == 1 && number != 11;
        boolean istaEnd1 = (number % 10) >= 2 && (number % 10) <= 4;
        boolean istaEnd2 = (number < 10 && number > 0) || (number > 20);
        boolean istaEnd3 = (number % 100) >= 2 && (number % 100) <= 4;

        if (istEnd) {
            System.out.println(number + " программист");
        } else if (istaEnd1 && istaEnd2 && istaEnd3) {
            System.out.println(number + " программиста");
        } else {
            System.out.println(number + " программистов");
        }
    }
}
