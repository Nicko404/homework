public class manualTask10 {
    public static void main(String[] args){
        //Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

        int factorial = 1;
        for (int i = 10; i <= 15; i++){
            factorial *= i;
        }
        System.out.println("От 10! до 15!: " + factorial);
    }
}
