package lesson_7.manualTask27.cards;

public class CardWithNotification extends CardToPay {

    public CardWithNotification() {
        super();
    }

    public CardWithNotification(int money) {
        super(money);
    }


    @Override
    public void depositMoney(int putMoney) {
        super.depositMoney(putMoney);
        System.out.printf("SMS: Your account has been credited to %dp\n", putMoney);
    }

    @Override
    public void withdrawMoney(int withdraw) {
        super.withdrawMoney(withdraw);
        System.out.printf("SMS: Your account has been debited %dp\n", withdraw);
    }

    public void transferOfFunds(CardToPay obj, int sum) {
        if (sum <= this.money) {
            obj.depositMoney(sum);
            money -= sum;
            System.out.println("The operation was successful");
        } else {
            System.out.println("insufficient funds");
        }
    }

}
