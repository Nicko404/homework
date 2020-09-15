package lesson_15.exchanger.requiredClasses;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exchanger {
    /*наш обменник, должен уметь покупать и продавать валюту,
    хранить в себе валюту(доллары, еврики и рубли) следить,
    что бы валюта в нем оставалось в пределе допустимого значения*/

    private final int maxUsd = 750;
    private final int maxEur = 750;

    private float usd = 100_000;
    private float eur = 100_000;
    private float byn = 100_000;

    private final float COEFFICIENT_USD_BYN = (float) 2.63;
    private final float COEFFICIENT_EUR_BYN = (float) 3.10;
    private final float COEFFICIENT_EUR_USD = (float) 1.18;
    private final float COEFFICIENT_USD_EUR = (float) 0.84;



    //продажа валюты: принимаем какую валюту хотят купить, какой валютой её хотят купить,
    public void sellCurrency(String currency, String currencyPay, float quantity) {

        if (quantity > 0) {

            float sumBynUsd = (((int) (COEFFICIENT_USD_BYN * 100)) * quantity) / (float) (100);
            float sumBynEur = (((int) (COEFFICIENT_EUR_BYN * 100)) * quantity) / (float) (100);
            float sumUsdEur = (((int) (COEFFICIENT_EUR_USD * 100)) * quantity) / (float) (100);
            float sumEurUsd = (((int) (COEFFICIENT_USD_EUR * 100)) * quantity) / (float) (100);

            switch (currency.toLowerCase()) {
                case "usd":

                    if (currencyPay.toLowerCase().equals("byn")) {
                        if (quantity <= maxUsd) {
                            if (quantity <= usd) {
                                usd -= quantity;
                                byn += sumBynUsd;
                                System.out.println("Операция проведена успешно");
                            } else {
                                System.out.println("В обменнике не достаточно запрашиваемых вами средств");
                            }
                        } else {
                            System.out.printf("В обменнике стоит ограничение на снимаемую сумму в %d USD", maxUsd);
                        }


                    } else if (currencyPay.toLowerCase().equals("eur")) {
                        if (quantity <= maxUsd) {
                            if (quantity <= usd) {
                                    usd -= quantity;
                                    eur += sumUsdEur;
                                    System.out.println("Операция проведена успешно");
                            } else {
                                System.out.println("В обменнике не достаточно запрашиваемых вами средств");
                            }
                        } else {
                            System.out.printf("В обменнике стоит ограничение на снимаемую сумму в %d USD", maxUsd);
                        }
                    } else {
                        System.out.println("Ошибка ввода валюты");
                    }

                    break;


                case "eur":
                    if (currencyPay.toLowerCase().equals("byn")) {
                        if (quantity <= maxEur) {
                            if (quantity <= eur) {
                                    eur -= quantity;
                                    byn += sumBynEur;
                                    System.out.println("Операция проведена успешно");
                            } else {
                                System.out.println("В обменнике не достаточно запрашиваемых вами средств");
                            }
                        } else {
                            System.out.printf("В обменнике стоит ограничение на снимаемую сумму в %d EUR", maxEur);
                        }


                    } else if (currencyPay.toLowerCase().equals("usd")) {
                        if (quantity <= maxEur) {
                            if (quantity <= eur) {
                                    eur -= quantity;
                                    usd += sumEurUsd;
                                    System.out.println("Операция проведена успешно");
                            } else {
                                System.out.println("В обменнике не достаточно запрашиваемых вами средств");
                            }
                        } else {
                            System.out.printf("В обменнике стоит ограничение на снимаемую сумму в %d EUR", maxEur);
                        }
                    }
                    break;


                default:
                    System.out.println("Ошибка ввода валюты");
            }

        } else {
            System.out.println("Вы ввели отрицательное число");
        }

        System.out.printf("В обменнике осталось %s USD, %s EUR, %s BYN\n", usd, eur, byn);
    }

    /*метод покупки валюты: принимаем какую валюту покупаем,
    * какой валютой за нее платим, сколько покупаем*/
    public void bueCurrency(String currency, String currencyPay, float quantity) {
        if (quantity > 0) {
            float sumBynUsd = (((int) (COEFFICIENT_USD_BYN * 100)) * quantity) / (float) (100);
            float sumBynEur = (((int) (COEFFICIENT_EUR_BYN * 100)) * quantity) / (float) (100);
            float sumUsdEur = (((int) (COEFFICIENT_EUR_USD * 100)) * quantity) / (float) (100);
            float sumEurUsd = (((int) (COEFFICIENT_USD_EUR * 100)) * quantity) / (float) (100);

            switch (currency.toLowerCase()) {
                case "usd":

                    if (currencyPay.toLowerCase().equals("byn")) {
                        if (quantity <= maxUsd) {
                            if (byn >= sumBynUsd) {
                                    byn -= sumBynUsd;
                                    usd += quantity;
                                    System.out.println("Операция прошла успешно");
                            } else {
                                System.out.println("В обменнике не достаточно средств для покупки валюты");
                            }
                        } else {
                            System.out.printf("В обменнике стоит ограничении на покупаемую сумму в %s USD", maxUsd);
                        }


                    } else if (currencyPay.toLowerCase().equals("eur")) {
                        if (quantity <= maxUsd) {
                            if (eur >= sumUsdEur) {
                                    eur -= sumUsdEur;
                                    usd += quantity;
                                    System.out.println("Операция прошла успешно");
                            } else {
                                System.out.println("В обменнике не достаточно средств для покупки валюты");
                            }
                        } else {
                            System.out.printf("В обменнике стоит ограничении на покупаемую сумму в %s USD", maxUsd);
                        }
                    }
                    break;

                case "eur":
                    if (currencyPay.toLowerCase().equals("byn")) {
                        if (quantity <= maxEur) {
                            if (byn >= sumBynEur) {
                                    byn -= sumBynEur;
                                    eur += quantity;
                                    System.out.println("Операция проведена успешно");
                            } else {
                                System.out.println("В обменнике не достаточно средств для покупки валюты");
                            }
                        } else {
                            System.out.printf("В обменнике стоит ограничении на покупаемую сумму в &s EUR", maxEur);
                        }


                    } else if (currencyPay.toLowerCase().equals("usd")) {
                        if (quantity <= maxEur) {
                            if (usd >= sumEurUsd) {
                                    usd -= sumEurUsd;
                                    eur += quantity;
                                    System.out.println("Операция проведена успешно");
                            } else {
                                System.out.println("В обменнике не достаточно средств для покупки валюты");
                            }
                        } else {
                            System.out.printf("В обменнике стоит ограничении на покупаемую сумму в &s EUR", maxEur);
                        }
                    } else {
                        System.out.println("Ошибка ввода валюты");
                    }
                    break;

                default:
                    System.out.println("Ошибка ввода валюты");

            }
        }
        System.out.printf("В обменнике осталось %s USD, %s EUR, %s BYN\n", usd, eur, byn);
    }

}
