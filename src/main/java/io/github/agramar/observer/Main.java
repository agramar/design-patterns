package io.github.agramar.observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        numberGenerator.addObserver(observer1);
        numberGenerator.addObserver(observer2);
        numberGenerator.execute();

        System.out.println("=================================");
        numberGenerator.deleteObserver(observer1);
        numberGenerator.execute();
    }
}
