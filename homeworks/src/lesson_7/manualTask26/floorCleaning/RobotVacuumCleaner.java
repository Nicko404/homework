package lesson_7.manualTask26.floorCleaning;

public class RobotVacuumCleaner extends VacuumCleaner {
    boolean fullBattery = false;
    boolean isWetCleaning = false;

    @Override
    public void inTheSocet() {
        super.inTheSocet();
        System.out.println("The robot vacuum cleaner is charged");
        fullBattery = !fullBattery;
    }

    @Override
    public void turnOn() {
        if (fullBattery) {
            System.out.println("The robot vacuum cleaner is on");
            vacuumCleanerIsOn = !vacuumCleanerIsOn;
        }
    }

    public void wetCleaning() {
        if (vacuumCleanerIsOn) {
            isWetCleaning = !isWetCleaning;
            System.out.println("Wet cleaning is included");
        }

    }

    @Override
    public void cleaning() {
        if (fullBattery && vacuumCleanerIsOn) {
            if (isWetCleaning) {
                System.out.println("Wet cleaning VJJJJJJJ");
            } else {
                System.out.println("Regular cleaning VJJJJJJ");
            }
            fullBattery = !fullBattery;
        }
        else {
            System.out.println("The robot vacuum cleaner does not cleaning");
        }
    }
}
