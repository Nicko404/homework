package lesson_10.manualTask29;

import java.util.ArrayList;
import java.util.List;
//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Удалить неудовлетворительные оценки из списка.

public class ManualTask29 {
    public static void main(String[] args) {
        List<Integer> score = new ArrayList<>();
        Double number;

        for (int i = 0; i < 25; i++) {
            number = (Math.random() * 10 + 1);
            score.add(number.intValue());
        }

        for (int i = 0; i < score.size(); i++) {
            if (score.get(i) <= 5) {
                score.remove(score.get(i));
                i--;
            }
        }

        for (Integer i : score) {
            System.out.print(i + "\t");

        }

    }
}
