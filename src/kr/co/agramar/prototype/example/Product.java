package kr.co.agramar.prototype.example;

public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
