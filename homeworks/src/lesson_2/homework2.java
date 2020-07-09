import java.util.Scanner;

public class homework2 {
    public static void main(String[] args){
        //задание №2 с папки homework
        /*Треугольник существует только тогда, когда сумма
          любых двух его сторонбольше третьей.
          Определить существует ли такой треугольник.
          Дано: a, b, c –стороны предполагаемого треугольника.
          Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
          Если хотя бы в одном случае отрезококажется больше суммы двух других,
          то треугольника с такими сторонами несуществует.
        */
        System.out.print("Введите стороны треугольника: ");
        Scanner sides = new Scanner(System.in);
        int a, b, c;

        a = sides.nextInt();
        b = sides.nextInt();
        c = sides.nextInt();

        boolean isTrue = a + b > c && a + c > b && b + c > a;

        if (isTrue){
            System.out.println("Такое треугольник существует");
        } else {
            System.out.println("Такой треугольник не существует");
        }

    }
}
