package lesson_7.robot;

import lesson_7.robot.samsungDetails.SamsungHand;
import lesson_7.robot.samsungDetails.SamsungHead;
import lesson_7.robot.samsungDetails.SamsungLeg;
import lesson_7.robot.sonyDetails.SonyHand;
import lesson_7.robot.sonyDetails.SonyHead;
import lesson_7.robot.sonyDetails.SonyLeg;
import lesson_7.robot.toshibaDetails.ToshibaHand;
import lesson_7.robot.toshibaDetails.ToshibaHead;
import lesson_7.robot.toshibaDetails.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        SamsungHead samHead = new SamsungHead(1000);
        SamsungHand samHand = new SamsungHand(900);
        SamsungLeg samLeg = new SamsungLeg(599);

        SonyHead sonHead = new SonyHead(899);
        SonyHand sonHand = new SonyHand(700);
        SonyLeg sonLeg = new SonyLeg(500);

        ToshibaHead tosHead = new ToshibaHead(1500);
        ToshibaHand tosHand = new ToshibaHand(750);
        ToshibaLeg tosLeg = new ToshibaLeg(699);

        AssembledRobot robot1 = new AssembledRobot(samHead, sonHand, tosLeg);
        AssembledRobot robot2 = new AssembledRobot(sonHead, tosHand, samLeg);
        AssembledRobot robot3 = new AssembledRobot(tosHead, samHand, sonLeg);

        robot1.action();
        robot2.action();
        robot3.action();

        System.out.println("Самая дорогая сборка робота, обошлась нам в " +
                Math.max(robot1.getPrice(), Math.max(robot2.getPrice(), robot3.getPrice())) + "$");

    }
}
