package lesson_7.rocket;

public class Spacex implements IStart {

    @Override
    public boolean systemCheck() {
        System.out.println("Илон Макс запустит свою ракету ни смотря не на что!");
        return true;
    }

    @Override
    public void engineStart() {
        System.out.println("Как тебе такое Роскосмос?");
    }

    @Override
    public void start() {
        System.out.println("Запускаем Теслу в космос");
    }
}
