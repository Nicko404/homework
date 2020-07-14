package lesson_3;

public class manualTask14 {
    public static void main(String[] args){
        //Создать массив оценок произвольной длины, вывести максимальную и
        //минимальную оценку, её (их) номера.

        int[] numbers = {123, 425, -645, -756, 231, 32, -3, 5, 321, -432};
        int max = numbers[0], min = numbers[0], indMax = 0, indMin = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max) {
                max = numbers[i];
                indMax = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                indMin = i;
            }
        }
        System.out.println("Максимальное значение массива: " + max + " и его индекс: " + indMax);
        System.out.println("Минимальное значение массива: " + min + " и его индекс: " + indMin);

    }
}
