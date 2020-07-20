package lesson_5;
//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогино для StringBuffer. Сравните скорость их выполнения.

public class manualTask_21 {
    public static void main(String[] args) {

        String str = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения String: " + (finish - start) + " мл/с");


        StringBuilder strBuilder = new StringBuilder();
        long startStrBuild = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strBuilder.append(i);
        }
        long finishStrBuild = System.currentTimeMillis();
        System.out.println("Время выполнения StringBuilder: " + (finishStrBuild - startStrBuild) + " мл/с");

        StringBuffer strBuffer = new StringBuffer();
        long startStrBuff = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strBuffer.append(i);
        }
        long finishStrBuff = System.currentTimeMillis();
        System.out.println("Время выполнения StringBuffer: " + (finishStrBuff - startStrBuff) + " мл/с");
    }
}
