package lesson_3;

public class task3 {
    public static void main(String[] args){
        //Вычислить: 1+2+4+8+...+256

        int answer = 0;
        for(int i = 1; i <= 256; i *= 2){
            answer += i;
        }
        System.out.println(answer);
    }
}
