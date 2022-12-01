package io.github.agramar.strategy;

public class TheManStrategy implements Strategy {

    @Override
    public Hand nextHand() {
        return Hand.ROCK;
    }
}
