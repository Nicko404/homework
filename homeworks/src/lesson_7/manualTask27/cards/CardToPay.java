package lesson_7.manualTask27.cards;

public class CardToPay extends CardForMoney {

    public CardToPay() {
        this.money = 0;
    }

    public CardToPay(int money) {
        this.money = money;
    }

    @Override
    public void depositMoney(int putMoney) {
        money += putMoney;
        System.out.println("The operation was successful");
    }

    @Override
    public void withdrawMoney(int withdraw) {
        if (withdraw <= this.money) {
            this.money -= withdraw;
            System.out.println("The operation was successful");
        } else {
            System.out.println("insufficient funds");
        }
    }

    public void fundBalance() {
        System.out.printf("You have %dp in your account\n", money);
    }
}