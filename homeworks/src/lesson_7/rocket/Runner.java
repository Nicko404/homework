package lesson_7.rocket;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        IStart istart = new Shuttle();
        IStart spacex = new Spacex();

        Cosmodrome cosmodrome = new Cosmodrome();

        cosmodrome.launch(istart);
        cosmodrome.launch(spacex);

    }
}
