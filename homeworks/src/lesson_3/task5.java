public class task5 {
    public static void main(String[] atgs){
        //Напишите программу печати таблицы перевода расстояний из дюймов в
        //сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

        double sm = 2.54;
        for (int i = 1; i <= 20; i++){
            System.out.println(i + "\" = " + (i * sm) + " см.");
        }
    }
}
