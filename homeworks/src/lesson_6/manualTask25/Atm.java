package lesson_6.manualTask25;

import jdk.management.cmm.SystemResourcePressureMXBean;

class Atm {
    //Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
    //банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
    //50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
    //снимающую деньги. На вход передается сумма денег. На выход – булевское
    //значение (операция удалась или нет). При снятии денег функция должна
    //рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
    //конструктор с тремя параметрами – количеством купюр.

    private int twenty, fifty, hundred, sum;

    Atm(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
        sum = twenty * 20 + fifty * 50 + hundred * 100;
    }

    boolean addMoney(int money) {
        boolean moneyNot30and10 = money != 10 && money != 30;
        boolean creditedMoney = (((money - 50) % 20 == 0) || ((money - 50) % 50) % 20 == 0) || money >= 20;
        boolean exeptionMoney = money % 20 == 0 || money % 50 == 0 || money % 20 == 10;

        if (creditedMoney && exeptionMoney && moneyNot30and10) {
            sum += money;
            System.out.println("Операция проведена успешно.");
            return true;
        } else {
            System.out.println("Вы не можете зачислить такую сумму, банкомат принимает купюры номиналом 20р, 50р, 100р.");
            return false;
        }

    }

    boolean withdrawMoney(int money) {
        int numTwenty = 0, numFifty = 0, numHundred = 0;
        boolean moneyNot30and10 = money != 10 && money != 30;
        boolean removeMoney = (((money - 50) % 20 == 0) || ((money - 50) % 50) % 20 == 0) || money >= 20;
        boolean exeptionMoney = money % 20 == 0 || money % 50 == 0 || money % 20 == 10;

        if (removeMoney && exeptionMoney && moneyNot30and10) {
            if (sum >= money) {
                if (money < 100) {
                    numFifty = money / 50;
                    money -= numFifty * 50;
                    numTwenty = money / 20;
                    money -= numTwenty * 20;
                    System.out.format("20-%d,  50-%d,  100-%d", numTwenty, numFifty, numHundred);
                } else if ((money % 100) % 50 == 0) {
                    sum -= money;
                    numHundred = money / 100;
                    money -= numHundred * 100;
                    numFifty = money / 50;
                    System.out.format("20-%d,  50-%d,  100-%d", numTwenty, numFifty, numHundred);
                } else if ((money - 100) % 100 >= 10) {
                    sum -= money;
                    numHundred = (money - 100) / 100;
                    money -= numHundred * 100;
                    if ((money % 100) / 10 == 9) numFifty = money / 50;
                    else numFifty = (money - 50) / 50;
                    money -= numFifty * 50;
                    numTwenty = money / 20;
                    System.out.format("20-%d,  50-%d,  100-%d", numTwenty, numFifty, numHundred);
                } else if (((money % 100) % 10) % 2 == 0) {
                    sum -= money;
                    numHundred = money / 100;
                    money -= numHundred * 100;
                    numFifty = money / 50;
                    money -= numFifty * 50;
                    numTwenty = money / 20;
                    System.out.format("20-%d,  50-%d,  100-%d", numTwenty, numFifty, numHundred);
                }

                System.out.println();
                return true;

            } else {
                System.out.println("В банкомате нет такой суммы");
                return false;
            }

        } else {
            System.out.println("Банкомат не может выдать такую сумму.");
            return false;
        }
    }

}
