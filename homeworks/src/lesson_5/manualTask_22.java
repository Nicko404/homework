package lesson_5;

import java.util.regex.*;

//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//записаных по правилам Java, с помощью регулярных выражений и вывести их на
//страницу.
public class manualTask_22 {
    public static void main(String[] args) {
        String str = "0x13d это шетснадцатиричное число. В Java " +
                "такие числа начинаются с префиксов 0x или 0X: 0x123321, 0X342, 0x53467434." +
                "Шестнадцатиричные числа записываютя с помощью латинских букв (A-F): 0xdfabc," +
                " oxdf12";

        String pattern = ".*[0][xX][0-9,a-f]+";
        Pattern hexadecimal = Pattern.compile(pattern);
        Matcher text = hexadecimal.matcher(str);

        while (text.find()) {
            System.out.println("begib: " + text.start());
            System.out.println("end: " + text.end());
        }

        System.out.println(str);




//        boolean b = m.find();
//        System.out.println(b);
//        while (b) {
//            System.out.println(m.start() + " " + m.end());
//            System.out.printf("lgds;");
//        }

        System.out.print("0xabcdf".matches(".*[0][xX][0-9,a-f].*"));
    }
}
