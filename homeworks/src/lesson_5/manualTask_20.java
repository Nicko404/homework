package lesson_5;

public class manualTask_20 {
    public static void main(String... args) {
        //Имеется строка с текстом. Вывести текст, составленный из последних букв
        //всех слов.
        char[] notWord = {',', '.', '!', '?', ':', ';'};
        String str = "Имеется строка с текстом. Вывести текст, составленный из последних букв \n" +
                "всех слов.";
        str += "   ";
        boolean isNotPuncMark = true;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ') {
                for (char symbol : notWord) {
                    if (symbol == str.charAt(i - 1)) {
                        isNotPuncMark = false;
                    }
                }
                if (isNotPuncMark) {
                    answer.append(str.charAt(i - 1));
                } else {
                    answer.append(str.charAt(i - 2));
                }
            }
            isNotPuncMark = true;
        }
        System.out.print(answer);

    }
}
