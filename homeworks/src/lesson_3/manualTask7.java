import java.util.Scanner;

public class manualTask7 {
    public static void main(String[] args){
        //Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
        //полностью закрыть круглой картонкой радиусом r.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размеры отверстия и радиус картонки: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), r = sc.nextDouble();
        sc.close();

        double hypotinuse = (a * a) + (b * b);
        System.out.println(Math.sqrt(hypotinuse));

        if (Math.sqrt(hypotinuse) <= r) {
            System.out.println("Картонка полностью закроет отверстие!");
        } else {
            System.out.println("Картонка не полностью закроет отверстие!");
        }
    }
}
