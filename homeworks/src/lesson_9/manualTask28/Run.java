package lesson_9.manualTask28;

public class Run {
    public static void main(String[] args) {
        String[] arrS = {"Vasya", "Petya", "Anton", "Max"};
        Integer[] arr = {1, 2, 3, 4, 5, 6};

        ClassForData<Integer> cfdInt = new ClassForData<>(arr);
        ClassForData<String> cfdStr = new ClassForData<>(arrS);


        System.out.println(cfdStr.get(3));
        System.out.println(cfdInt.get(4));
    }
}
