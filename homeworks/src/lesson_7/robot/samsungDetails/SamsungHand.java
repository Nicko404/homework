package lesson_7.robot.samsungDetails;

import lesson_7.robot.hands.IHand;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {

    }

    @Override
    public void upHand() {
        System.out.println("Рука поднята во имя самсунга");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
