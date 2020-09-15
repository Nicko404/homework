package lesson_5;


public class manualTask_20 {
    public static void main(String... args) {
        //Имеется строка с текстом. Вывести текст, составленный из последних букв
        //всех слов.
        String str = "Имеется строка с текстом. Вывести текст, составленный из последних букв\n" +
                " всех слов.";

        str = str.trim();
        str = str.replace(" ,", "");
        str = str.replace(" .", "");
        str = str.replace(",", "");
        str = str.replace(".", "");
        String[] works = str.split(" ");
        String answer = "";

        for (String x : works) {
            answer += x.charAt(x.length() - 1);
        }
        System.out.println("Последние символы каждого слова из переданной сроки: " + answer);
    }

}
