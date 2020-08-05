package lesson_6.manualTask25;

import java.util.Scanner;

//Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
//банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
//50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
//снимающую деньги. На вход передается сумма денег. На выход – булевское
//значение (операция удалась или нет). При снятии денег функция должна
//рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
//конструктор с тремя параметрами – количеством купюр.

public class Runner {
    public static void main(String[] args) {
        Atm atm1 = new Atm(20, 15, 10);
        Scanner sc = new Scanner(System.in);
        int i = 0, money;
        System.out.println("Банкомат объектклассбанка");

        while (i == 0) {
            System.out.print("\n0 - выход\n1 - пополнить счет\n2 - снять со счета\nВаш выбор: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Заберите вашу карту!");
                    i = 1;
                    break;
                case 1:
                    System.out.print("Введите сумму пополнения: ");
                    money = sc.nextInt();
                    atm1.addMoney(money);
                    break;
                case 2:
                    System.out.print("Введите необходимую вам сумму: ");
                    money = sc.nextInt();
                    atm1.withdrawMoney(money);
                    break;
                default:
                    System.out.println("Ошибка ввода операции.");
            }

        }

    }
}
//Лоханулся с pull requests-ом и залил ветку с дз 6 урока в мастер, до того, как ты ее проверил