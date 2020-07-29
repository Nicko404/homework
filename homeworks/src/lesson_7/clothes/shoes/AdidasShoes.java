package lesson_7.clothes.shoes;

public class AdidasShoes implements IShoes{
    @Override
    public void putOn() {
        System.out.println("Надкваю обувь от Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю обуь от Adidas");
    }
}
