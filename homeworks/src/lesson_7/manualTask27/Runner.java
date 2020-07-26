package lesson_7.manualTask27;

import lesson_7.manualTask27.cards.CardToPay;
import lesson_7.manualTask27.cards.CardWithNotification;

public class Runner {
    public static void main(String[] args) {

        CardToPay card1 = new CardToPay(234);
        CardWithNotification card2 = new CardWithNotification(100);

        card1.depositMoney(1000);
        card1.fundBalance();

        card2.depositMoney(1000);
        card2.fundBalance();

        card1.withdrawMoney(120);
        card1.fundBalance();

        card2.withdrawMoney(999);
        card2.fundBalance();

        card2.transferOfFunds(card1, 50);
        card1.fundBalance();
        card2.fundBalance();
    }
}
