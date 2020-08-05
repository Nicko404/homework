package lesson_6.manualTask24;
//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных.
public class Runner {
    public static void main(String[] args) {
        Interval interval1 = new Interval(23, 12, 57);
        Interval interval2 = new Interval(3687);

        System.out.format("Секунд во втором интервале: %d.\n", interval2.allSecondInInterval());
        System.out.format("Секунд в первом интервале: %d.\n", interval1.allSecondInInterval());

        System.out.println(interval1.comparison(interval2));
        System.out.println(interval1);
    }
}
//Лоханулся с pull requests-ом и залил ветку с дз 6 урока в мастер, до того, как ты ее проверил