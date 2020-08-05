package lesson_7.clothes.pants;

public class AdidasPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надел штаны Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Adidas");
    }
}
