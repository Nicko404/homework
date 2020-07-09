import java.util.Scanner;

public class homework4and5 {
    public static void main(String[] argas) {
        //задание №4 с папки homework
        /*4) Даны 3 целых числа. Найти количество положительных чисел в исходномнаборе.
          5) Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе.
        */
        int answerPos = 0, answerNeg = 0, answerZero = 0, a, b, c;
        Scanner numScan = new Scanner(System.in);
        System.out.print("Введите три числа: ");

        a = numScan.nextInt();
        b = numScan.nextInt();
        c = numScan.nextInt();

        if (a > 0) {
            answerPos++;
        } else if (a < 0) {
            answerNeg++;
        } else {
            answerZero++;
        }

        if (b > 0) {
            answerPos++;
        } else if (b < 0) {
            answerNeg++;
        } else {
            answerZero++;
        }

        if (c > 0) {
            answerPos++;
        } else if (c < 0) {
            answerNeg++;
        } else {
            answerZero++;
        }

        System.out.println("Положительных чисел: " + answerPos);
        System.out.println("Отрицательных чисел: " + answerNeg);
        System.out.println("Нолей: " + answerZero);
    }
}
