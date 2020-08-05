package lesson_7.robot.sonyDetails;

import lesson_7.robot.hands.IHand;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {

    }

    @Override
    public void upHand() {
        System.out.println("Рука поднята благодаря сони");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
