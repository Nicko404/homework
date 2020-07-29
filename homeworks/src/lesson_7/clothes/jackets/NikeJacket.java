package lesson_7.clothes.jackets;

public class NikeJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надел куртку Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Nike");
    }
}
