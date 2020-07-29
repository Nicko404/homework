package lesson_7.robot.toshibaDetails;

import lesson_7.robot.legs.ILeg;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {

    }

    @Override
    public void step() {
        System.out.println("Выполняю шаг вместе с тошиба");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
