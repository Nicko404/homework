package lesson_6.manualTask24;
//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных.

public class Interval {
    private int seconds;
    private int minutes;
    private int hour;

    Interval(int hour, int minutes, int seconds) {
        if (seconds > 60 || minutes > 60) System.out.println("Часы и секунды не могут быть более 60");
        else {
            this.hour = hour;
            this.minutes = minutes;
            this.seconds = seconds;
        }
    }

    Interval(int seconds) {
        this.seconds = seconds % 60;
        this.minutes = (seconds % 3600) / 60;
        this.hour = seconds / 3600;

    }

    public int allSecondInInterval() {
        int outSeconds = this.seconds + (this.minutes * 60) + (this.hour * 3600);
        return outSeconds;
    }

    public String comparison(Interval inter) {
        String str;
        if (this.allSecondInInterval() > inter.allSecondInInterval()) {
            str = String.format("Интервал этого объекта больше переданного");
        } else if (this.allSecondInInterval() < inter.allSecondInInterval()) {
            str = String.format("Интервал этого объекта меньше переданного");
        } else {
            str = String.format("Интервалы объектов равны");
        }
        return str;
    }

    public String toString() {
        return "Interval{" +
                "hour=" + hour +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                "}";
    }
}
