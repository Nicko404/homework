package lesson_7.hierarchyOfTransport.mainTransport;

public class Truck extends GroundTransport {

    int carrying;

    public Truck(int power, int maxSpeed, int weight, String brand, int wheels, int fuelConsumption,
                 int carrying) {
        super(power, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.carrying = carrying;
    }

    public void uploadTruck(double cargo) {
        if (carrying >= cargo) {
            System.out.println("Грузовик загружен.");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    @Override
    public String characteristic() {
        float powerKilowatts = (float) (power * 0.74);
        return String.format("This is a truck: power = %d, " +
                        "maximum speed = %d, weight = %d, brand = %s,\n\t\t\t number of wheels = %d, " +
                        "fuel consumption = %d, power in kilowatts = %.2f,\n\t\t\t carrying = %d\n",
                power, maxSpeed, weight, brand, wheels, fuelConsumption, powerKilowatts, carrying);
    }
}
