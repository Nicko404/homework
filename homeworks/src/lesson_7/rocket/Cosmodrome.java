package lesson_7.rocket;

public class Cosmodrome {

    void launch(IStart istart) throws InterruptedException {
        if (istart.systemCheck()) {
            istart.engineStart();
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            istart.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }
}
