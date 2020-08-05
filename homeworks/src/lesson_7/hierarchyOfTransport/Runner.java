package lesson_7.hierarchyOfTransport;

import lesson_7.hierarchyOfTransport.mainTransport.CivilAirplane;
import lesson_7.hierarchyOfTransport.mainTransport.Military;
import lesson_7.hierarchyOfTransport.mainTransport.PassengerCar;
import lesson_7.hierarchyOfTransport.mainTransport.Truck;

public class Runner {
    public static void main(String[] args) {
        PassengerCar car1 = new PassengerCar(222, 110, 3,
                "Mazda", 4, 25, 6, "Cabriolet");
        Truck truck = new Truck(100,100,10,"BMW", 6,25,27);
        CivilAirplane civil = new CivilAirplane(500,1000,17,"Air Brand",45,
                10,237,true);
        Military military = new Military(400,2000,5,"SpaceX",
                4, 2,true, 10);

        System.out.println(car1.characteristic());
        System.out.println();
        System.out.println(truck.characteristic());
        System.out.println();
        System.out.println(civil.characteristic());
        System.out.println();
        System.out.println(military.characteristic());
        System.out.println();
        car1.calculationDistance(2.2);
        truck.uploadTruck(27);
        civil.capacity(150);
        military.catapult();
        military.shot();
    }
}
