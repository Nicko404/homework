package lesson_3;

public class manualTask16 {
    public static void main(String[] args){
        //Определите сумму элементов одномерного массива, расположенных между
        //минимальным и максимальным значениями.

        int[] numbers = new int[7];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 10);
        }

        int max = numbers[0], min = numbers[0], indMax = 0, indMin = 0, sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                indMax = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                indMin = i;
            }
        }

        if(indMin > indMax){
            int temp = indMin;
            indMin = indMax;
            indMax = temp;
        }

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + "\t");
        }

        System.out.println("\nmin " + min + " max " + max);
        for (int i = indMin; i <= indMax; i++){
            sum += numbers[i];
        }

        System.out.print("Сумма чисел массива между максимальным и минимальны значением: " + sum);
    }
}
