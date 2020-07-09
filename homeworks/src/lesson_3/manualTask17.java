public class manualTask17 {
    public static void main(String[] args){
        //Создать двухмерный квадратный массив, и заполнить его «бабочкой»

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (i == j || j + i == 4 || j == 2 || i == 0 || i == 4){
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
