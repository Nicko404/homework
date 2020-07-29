package lesson_7.clothes.pants;

public class ReebokPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надел штаны Reebok");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Reebok");
    }
}
