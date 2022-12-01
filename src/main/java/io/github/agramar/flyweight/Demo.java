package io.github.agramar.flyweight;

public class Demo {
    public static void main(String[] args) {
        CoffeeType latte = Cafe.getCoffeeType("LATTE", 0, 1, 1);
        latte.taste();

        CoffeeType americano = Cafe.getCoffeeType("AMERICANO", 1, 0, 1);
        americano.taste();

        CoffeeType anotherLatte = Cafe.getCoffeeType("LATTE", 0, 0, 0);
        anotherLatte.taste();
    }
}
