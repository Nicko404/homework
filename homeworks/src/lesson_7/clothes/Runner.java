package lesson_7.clothes;

import lesson_7.clothes.jackets.AdidasJacket;
import lesson_7.clothes.jackets.IJacket;
import lesson_7.clothes.pants.IPants;
import lesson_7.clothes.pants.NikePants;
import lesson_7.clothes.shoes.IShoes;
import lesson_7.clothes.shoes.ReebokShoes;

public class Runner {
    public static void main(String[] args) {

        IJacket adiJacket = new AdidasJacket();
        IPants nikPants = new NikePants();
        IShoes rebShoes = new ReebokShoes();

        Human human = new Human("Vasya", adiJacket, nikPants, rebShoes);

        human.dress();
        human.undress();
        System.out.println(human.getName());

    }
}
