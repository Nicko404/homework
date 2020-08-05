package lesson_7.robot.sonyDetails;

import lesson_7.robot.legs.ILeg;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {

    }

    @Override
    public void step() {
        System.out.println("Выполняю шаг ради сони");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
