package lesson_7.robot.samsungDetails;

import lesson_7.robot.legs.ILeg;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {

    }

    @Override
    public void step() {
        System.out.println("Выполняю самсунговский шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
