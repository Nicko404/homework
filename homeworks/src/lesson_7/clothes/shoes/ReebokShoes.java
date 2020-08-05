package lesson_7.clothes.shoes;

public class ReebokShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Надеваю обувь от Reebok");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю обувь от Reebok");
    }
}
