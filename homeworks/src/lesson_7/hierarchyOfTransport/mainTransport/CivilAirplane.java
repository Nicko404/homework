package lesson_7.hierarchyOfTransport.mainTransport;

public class CivilAirplane extends AirTransport {

    int numberOfPassengers;
    boolean businessClass;

    public CivilAirplane(int power, int maxSpeed, int weight, String brand, int wingspan,
                         int lengthOfRunway, int numberOfPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingspan, lengthOfRunway);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    public void capacity(int numPeople) {
        if (numberOfPassengers >= numPeople) {
            System.out.println("Пассажиры готовы к вылету.");
        } else {
            System.out.println("Нужен самолет побольше.");
        }
    }

    public String characteristic() {
        float powerKilowatts = (float) (power * 0.74);
        return String.format("This is a civil airplane: power = %d, " +
                        "maximum speed = %d, weight = %d,\n\t\t\t brand = %s, wingspan = %d " +
                        "length of runway = %d, number of passengers = %d,\n\t\t\t power in kilowatts = %.2f " +
                        "business class = %s\n",
                power, maxSpeed, weight, brand, wingspan,lengthOfRunway, numberOfPassengers,
                powerKilowatts, businessClass);
    }
}
