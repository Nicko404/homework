package lesson_7.robot.toshibaDetails;

import lesson_7.robot.heads.IHead;

public class ToshibaHead implements IHead {
    public int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {

    }

    @Override
    public void speek() {
        System.out.println("Говорит голова от Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
