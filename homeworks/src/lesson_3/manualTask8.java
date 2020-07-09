import java.util.Random;

public class manualTask8 {
    public static void main(String[] args){
        //Имеется целове число (задать с помощью Random rand = new Random(); int x =
        //rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
        //нему слово «рублей» в правильном падеже.

        Random rand = new Random();
        int money = rand.nextInt();
        String phrase = "";

        if (money <= 0){
            phrase += "У нас проблемы, на нашем счету " + money + " ";
            money *= -1;
        } else {
            phrase += "Прикинь, на нашем счету " + money + " ";
        }

        boolean endingLja1 = money % 10 >= 2 && money % 10 <= 4;
        boolean endingLja2 = money < 10 || money > 20;
        boolean endingLja3 = money % 100 < 10 || money % 100 > 20;

        if (money % 10 == 1 && money % 100 != 11){
            phrase += "рубль.";
        } else if (endingLja1 && endingLja2 && endingLja3) {
            phrase += "рубля.";
        } else {
            phrase += "рублей.";
        }

        System.out.println(phrase);

    }
}
