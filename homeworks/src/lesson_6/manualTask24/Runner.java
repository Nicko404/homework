package lesson_6.manualTask24;

public class Runner {
    public static void main(String[] args) {
        Interval interval1 = new Interval(23,12,57);
        Interval interval2 = new Interval(3687);

        System.out.format("Секунд во втором интервале: %d.\n", interval2.allSecondInInterval());
        System.out.format("Секунд в первом интервале: %d.\n", interval1.allSecondInInterval());

        System.out.println(interval1.comparison(interval2));
        System.out.println(interval1);
    }
}
