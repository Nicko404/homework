package lesson_10.manualTask31;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.
public class ManualTask31 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            numbers.add((int) (Math.random() * 10 + 1));
        }

        Iterator<Integer> iterator = numbers.iterator();
        int maxNumber = numbers.get(0);
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        System.out.println(numbers + "\n" + maxNumber);

    }
}
