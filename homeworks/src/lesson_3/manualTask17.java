package lesson_3;

public class manualTask17 {
    public static void main(String[] args) {
        //Создать двухмерный квадратный массив, и заполнить его «бабочкой»

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || (j + i == array.length - 1) ||
                   (j + i < array.length - 1 && j > i) ||
                   (j + i > array.length - 1 && j < i))  {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
