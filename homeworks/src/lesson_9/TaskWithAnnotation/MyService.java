package lesson_9.TaskWithAnnotation;

import java.util.Objects;

@Version(versionNumber = 1.0)
public class MyService {
    private static int numberOfClients;
    private int amountOfGoods;
    public String nameOfOrganization;
    public String productName;

    public MyService(int numberOfClients, int amountOfGoods, String nameOfOrganization, String productName) {
        this.numberOfClients = numberOfClients;
        this.amountOfGoods = amountOfGoods;
        this.nameOfOrganization = nameOfOrganization;
        this.productName = productName;
    }

    public static void setNumberOfClients(int numberOfClients) {
        MyService.numberOfClients = numberOfClients;
    }

    public static int getNumberOfClients() {
        return numberOfClients;
    }

    public void setAmountOfGoods(int amountOfGoods) {
        this.amountOfGoods = amountOfGoods;
    }

    public int getAmountOfGoods() {
        return amountOfGoods;
    }

    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }

    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    private void thisClassInfo() {
        System.out.printf("Наша организация %s занимается продажей %s." +
                        " На наших складах имеется %d товаров, а нашими услугами пользуются %d" +
                        " постоянных клиентов\n",
                nameOfOrganization, productName, amountOfGoods, numberOfClients);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return amountOfGoods == myService.amountOfGoods &&
                Objects.equals(nameOfOrganization, myService.nameOfOrganization) &&
                Objects.equals(productName, myService.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfGoods, nameOfOrganization, productName);
    }
}
