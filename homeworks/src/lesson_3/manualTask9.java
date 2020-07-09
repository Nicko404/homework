public class manualTask9 {
    public static void main(String[] args){
        //надо получить ряд случайных чисел, и посчитать
        //среднее арифметическое от них. Ввод чисел прекращается, если очередным числом
        //будет ноль.
        //Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
        //произведение, т.е. факториал числа.

        double averageMulti = 0;
        double multiplication = 1;
        int n = 0;
        int x = (int)(Math.random() * 20);

        while(x != 0) {
            multiplication *= x;
            n++;
            x = (int)(Math.random() * 20);
        }

        if(n != 0){
            averageMulti = multiplication / n;
        } else {
            averageMulti = 0;
        }
        System.out.println("Итераций цикла: " + n + "\nСреднее:" + averageMulti);
    }
}
