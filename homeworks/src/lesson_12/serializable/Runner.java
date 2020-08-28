package lesson_12.serializable;

import java.io.*;


public class Runner {
    public static void main(String[] args) {

        Car car1 = new Car(4000, 210, "Porsche");
        Car car2 = null;

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream
                ("src/lesson_12/serializable/carSave.dat"))) {
            out.writeObject(car1);

        } catch (IOException e) {
            e.getMessage();
        }

        try (ObjectInputStream inp = new ObjectInputStream(new FileInputStream
                ("src/lesson_12/serializable/carSave.dat"))) {

            car2 = (Car) inp.readObject();

        } catch (IOException e) {
            System.out.println("File not found");
        } catch (ClassNotFoundException e) {
            System.out.println("Object not found");
        }

        System.out.println(car1.toString() + "\n" + car2.toString());
    }
}
