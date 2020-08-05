package lesson_7.hierarchyOfTransport.mainTransport;

public abstract class GroundTransport extends Transport {

    protected int wheels;
    protected int fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int weight, String brand, int wheels,
                           int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }
}
