package lesson_3;

public class task7 {
    public static void main(String[] args){
        //Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
        int answer = 0;
        for (int i = 1; i < 100; i += 2){
            answer += i;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99: " + answer);
    }
}
