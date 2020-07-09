public class task1 {
    public static void main(String[] args){
        //Начав тренировки, спортсмен в первый день пробежал 10 км.
        // Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
        // Какой суммарный путь пробежит спортсмен за 7 дней?

        int day = 0;
        double distance = 10.0, answer = 0.0;
        while (day < 7) {
            answer += distance;
            distance = (distance * 0.1) + distance;
            day++;

        }
        System.out.print(answer + " км.");
    }
}
