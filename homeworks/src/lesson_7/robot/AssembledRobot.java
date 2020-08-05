package lesson_7.robot;

import lesson_7.robot.hands.IHand;
import lesson_7.robot.heads.IHead;
import lesson_7.robot.legs.ILeg;

public class AssembledRobot implements IRobot {

    private IHand hand;
    private IHead head;
    private ILeg leg;

    public AssembledRobot(IHead head, IHand hand, ILeg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public AssembledRobot() {
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHead getHead() {
        return head;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    public ILeg getLeg() {
        return leg;
    }

    @Override
    public void action() {
    head.speek();
    hand.upHand();
    leg.step();
    }

    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }
}
