package lesson_7.manualTask27.cards;

public abstract class CardForMoney {
    protected int money;

    public CardForMoney() {
        this.money = 0;
    }

    protected abstract void depositMoney(int putMoney);

    protected abstract void withdrawMoney(int withdraw);

}
