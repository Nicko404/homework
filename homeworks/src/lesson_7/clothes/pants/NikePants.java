package lesson_7.clothes.pants;

public class NikePants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надел штаны Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Nike");
    }
}
