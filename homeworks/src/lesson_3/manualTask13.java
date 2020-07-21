package lesson_3;

public class manualTask13 {
    public static void main(String[] args){
        //Создать последовательность случайных чисел, найти и вывести наибольшее
        //из них.

        int[] numbers = {123, 425, -645, -756, 231, 32, -3, 5, 321, -432};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        /*Можно было сделать покруче. Через Сканер узнать кол-во чисел,
        * через for, сканнер и ручками заполнить массив и уже дальше с ним работать.*/
        System.out.println("Наибольшее число в массиве: " + max);
    }
}
