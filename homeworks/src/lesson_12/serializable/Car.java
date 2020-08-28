package lesson_12.serializable;

import java.io.Serializable;

public class Car implements Serializable {
    int price;
    int speed;
    String brand;

    public Car(int price, int speed, String brand) {
        this.price = price;
        this.speed = speed;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", speed=" + speed +
                ", brand='" + brand + '\'' +
                '}';
    }
}
