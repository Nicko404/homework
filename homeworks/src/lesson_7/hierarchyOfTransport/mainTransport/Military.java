package lesson_7.hierarchyOfTransport.mainTransport;

public class Military extends AirTransport {

    boolean ejection;
    int numberOfMissiles;

    public Military(int power, int maxSpeed, int weight, String brand, int wingspan, int lengthOfRunway,
                    boolean ejection, int numberOfMissiles) {
        super(power, maxSpeed, weight, brand, wingspan, lengthOfRunway);

        this.ejection = ejection;
        this.numberOfMissiles = numberOfMissiles;
    }

    public void catapult() {
        if (ejection) System.out.println("Катапультирование прошло успешно!");
        else System.out.println("У вас нет такой системы");
    }

    public void shot() {
        if (numberOfMissiles != 0 && numberOfMissiles > 0) {
            System.out.println("Ракета пошла...");
            numberOfMissiles -= 1;
        } else System.out.println("Боеприпасы отсутсвуют!");
    }

    public String characteristic() {
        float powerKilowatts = (float) (power * 0.74);
        return String.format("This is a military airplane: power = %d, " +
                        "maximum speed = %d, weight = %d, brand = %s,\n\t\t\twingspan = %d " +
                        "length of runway = %d, power in kilowatts = %.2f,\n\t\t\t" +
                        "number of missiles = %d, ejection = %s\n",
                power, maxSpeed, weight, brand, wingspan, lengthOfRunway,
                powerKilowatts, numberOfMissiles, ejection);
    }
}

