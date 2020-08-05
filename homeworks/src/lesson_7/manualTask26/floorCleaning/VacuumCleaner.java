package lesson_7.manualTask26.floorCleaning;

public class VacuumCleaner implements FloorCleaning {

    public boolean inSocet = false;
    public boolean vacuumCleanerIsOn = false;

    public void inTheSocet(){
        System.out.println("The vacuum cleaner is plugged in");
        inSocet = !inSocet;
    }

    public void turnOn() {
        if (inSocet) {
            System.out.println("The vacuum cleaner in on");
            vacuumCleanerIsOn = !vacuumCleanerIsOn;
        }
    }

    @Override
    public void cleaning() {
        if (inSocet && vacuumCleanerIsOn) {
            System.out.println("VJJJJJJJJJ");
        } else {
            System.out.println("The vacuum cleaner does not cleaning");
        }
    }
}
