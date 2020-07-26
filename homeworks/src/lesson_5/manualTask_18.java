package lesson_5;

/*
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
 *общее их количество.
 * */

public class manualTask_18 {
    public static void main(String[] args) {
        String str = "Шла Маша, по шоссе и?? сосала: сушкку!";

        char[] punctuationMarks = {',', '.', ':', ';', '!', '?'};
        int number = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            for (char marks : punctuationMarks) {
                if (symbol == marks) {
                    number++;
                }
            }

        }
        System.out.print(String.format("Знаков препинания в вашей строке : %d", number));

    }
}
