package io.github.agramar.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits;
    private final Random random;
    private static final String[] fruitNames = {"APPLE", "GRAPE", "BANANA", "ORANGE"};

    public Gamer(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
        this.random = new Random();
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }

    private String getFruit() {
        String prefix = random.nextBoolean() ? "GOOD" : "";
        return prefix + fruitNames[random.nextInt(fruitNames.length)];
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("Money increased.");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("Money decreased to half.");
        } else if (dice == 6) {
            String fruit = getFruit();
            System.out.println("Get Fruit(" + fruit + ").");
            fruits.add(fruit);
        } else {
            System.out.println("Not changed.");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        for (String fruit : fruits) {
            if (fruit.startsWith("GOOD")) {
                m.addFruit(fruit);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }
}
