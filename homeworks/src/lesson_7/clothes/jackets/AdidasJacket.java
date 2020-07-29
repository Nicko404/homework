package lesson_7.clothes.jackets;

public class AdidasJacket implements IJacket {

    @Override
    public void putOn() {
        System.out.println("Надел куртку Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Adidas");
    }
}
