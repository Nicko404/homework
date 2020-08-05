package lesson_7.hierarchyOfTransport.mainTransport;

public abstract class AirTransport extends Transport {

    int wingspan;
    int lengthOfRunway;

    public AirTransport(int power, int maxSpeed, int weight, String brand, int wingspan,
                        int lengthOfRunway) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.lengthOfRunway = lengthOfRunway;
    }
}
