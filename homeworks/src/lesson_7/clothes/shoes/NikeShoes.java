package lesson_7.clothes.shoes;

public class NikeShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Надеваю обувь от Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю обувь от Nike");
    }
}
