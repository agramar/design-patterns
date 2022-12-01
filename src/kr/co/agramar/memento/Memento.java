package kr.co.agramar.memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private final int money;
    private final List<String> fruits;

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public List<String> getFruits() {
        return new ArrayList<>(fruits);
    }

    public void addFruit(String fruit) {
        this.fruits.add(fruit);
    }
}
