package lesson_7.rocket;

public class Shuttle implements IStart {
    @Override
    public boolean systemCheck() {
        int number = (int) (Math.random() * 10);
        return number > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
