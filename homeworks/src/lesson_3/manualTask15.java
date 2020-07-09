public class manualTask15 {
    public static void main(String[] args){
        //Создать массив, заполнить его случайными элементами, распечатать,
        //перевернуть, и снова распечатать (при переворачивании нежелательно создавать
        //еще один массив).

        int[] numbers = new int[7];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 10);
        }

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + "\t");
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + "\t");
        }

    }
}
