package io.github.agramar.prototype.example;

public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
