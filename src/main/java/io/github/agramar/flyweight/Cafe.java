package io.github.agramar.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Cafe {
    private static final Map<String, CoffeeType> coffeeTypes = new HashMap<>();

    public static CoffeeType getCoffeeType(String name, int water, int milk, int espresso) {
        return coffeeTypes.computeIfAbsent(name, newCoffeeTypeName -> new CoffeeType(name, water, milk, espresso));
    }
}
