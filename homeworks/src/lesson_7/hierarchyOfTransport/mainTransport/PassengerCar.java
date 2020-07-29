package lesson_7.hierarchyOfTransport.mainTransport;

public class PassengerCar extends GroundTransport {

    protected String bodyType;
    protected int numberOfPassengers;

    public PassengerCar(int power, int maxSpeed, int weight, String brand, int wheels, int fuelConsumption,
                        int numberOfPassengers, String bodyType) {
        super(power, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.numberOfPassengers = numberOfPassengers;
        this.bodyType = bodyType;
    }

    private double calculationFuel(int exenditure, double distance) {
        return (distance /100) * exenditure;
    }

    public void calculationDistance(double time) {
        double distance = time* this.maxSpeed;
        double exenditure =  calculationFuel(fuelConsumption, distance);
        System.out.printf("За время %.1f часа, автомобиль %s двигаясь с максимальной" +
                " скоростью %d км/ч\nизрасходует %.1f литров топлива.\n", time, this.brand,
                this.maxSpeed, exenditure);
    }

    public String characteristic() {
        float powerKilowatts = (float) (power * 0.74);
        return String.format("This is a passenger car: power = %d, " +
                        "maximum speed = %d, weight = %d, \n\t\t\tbrand = %s, number of wheels = %d, " +
                        "body type = %s, \n\t\t\tfuel consumption = %d, number of passengers = %d, " +
                        "power in kilowatts = %.2f.\n",
                power, maxSpeed, weight, brand, wheels, bodyType, fuelConsumption,
                numberOfPassengers, powerKilowatts);
    }
}
