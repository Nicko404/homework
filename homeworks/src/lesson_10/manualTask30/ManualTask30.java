package lesson_10.manualTask30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//числа.
public class ManualTask30 {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        System.out.println(numbers);
        Set<Integer> diffNumbers = new HashSet<>(numbers);
        System.out.println(diffNumbers);
    }
}
