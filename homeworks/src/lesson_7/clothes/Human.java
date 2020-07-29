package lesson_7.clothes;

import lesson_7.clothes.jackets.IJacket;
import lesson_7.clothes.pants.IPants;
import lesson_7.clothes.shoes.IShoes;

public class Human implements IHuman {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(String name, IJacket jacket, IPants pants,IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Human() {}

    public Human(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IJacket getJacket(){
        return jacket;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IPants getPants() {
        return pants;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public IShoes getShoes() {
        return shoes;
    }

    @Override
    public void dress() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void undress() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
