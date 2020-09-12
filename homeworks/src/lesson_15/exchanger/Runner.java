package lesson_15.exchanger;

import lesson_15.exchanger.requiredClasses.Exchanger;


public class Runner {
    public static void main(String[] args) {

        Exchanger exchanger = new Exchanger();

        for (int i = 0; i < 3; i++) {

            new Thread(() -> {

                synchronized (exchanger) {
                    exchanger.sellCurrency("usd", "eur", 100);
                    exchanger.bueCurrency("eur", "byn", 600);
                }

            }).start();
        }
    }
}
