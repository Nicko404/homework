package lesson_7.robot.toshibaDetails;

import lesson_7.robot.hands.IHand;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {

    }

    @Override
    public void upHand() {
        System.out.println("Рука поднята не без помощи тошиба");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
