import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        //Составьте программу, вычисляющую A*B, не пользуясь операцией умножения

        Scanner sc = new Scanner(System.in);
        int num1, num2, answer = 0;
        System.out.print("Введите первый множитель: ");
        num1 = sc.nextInt();
        System.out.print("Введите второй множитель: ");
        num2 = sc.nextInt();
        sc.close();

        for (int i = 0; i < num2; i++){
            answer += num1;
        }
        System.out.println(num1 + "*" + num2 + "=" + answer);
    }
}
