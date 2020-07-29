package lesson_7.robot.samsungDetails;

import lesson_7.robot.heads.IHead;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {

    }

    @Override
    public void speek() {
        System.out.println("Говорит голова от Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
