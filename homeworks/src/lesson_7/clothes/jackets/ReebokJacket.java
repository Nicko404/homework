package lesson_7.clothes.jackets;

public class ReebokJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надел куртку Reebok");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Reebok");
    }
}
