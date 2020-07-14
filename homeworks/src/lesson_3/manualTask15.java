package lesson_3;

public class manualTask15 {
    public static void main(String[] args) {
        //Создать массив, заполнить его случайными элементами, распечатать,
        //перевернуть, и снова распечатать (при переворачивании нежелательно создавать
        //еще один массив).

        int[] numbers = new int[7];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
        System.out.println();

        int temp = 0, j = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++, j--) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
    }
}
