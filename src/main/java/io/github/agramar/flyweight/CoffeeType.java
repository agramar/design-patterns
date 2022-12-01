package io.github.agramar.flyweight;

public class CoffeeType implements Coffee {
    private final String name;
    private final int water;
    private final int milk;
    private final int espresso;

    public CoffeeType(String name, int water, int milk, int espresso) {
        this.name = name;
        this.water = water;
        this.milk = milk;
        this.espresso = espresso;
    }

    @Override
    public void taste() {
        System.out.println("==== taste ====");
        System.out.println("name : " + name);
        System.out.println("water : " + water);
        System.out.println("milk : " + milk);
        System.out.println("espresso : " + espresso);
        System.out.println("===============");
    }
}
