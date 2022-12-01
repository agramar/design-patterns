package io.github.agramar.strategy;

public class RatStrategy implements Strategy {

    @Override
    public Hand nextHand() {
        return Hand.PAPER;
    }

    @Override
    public void study(boolean win) {

    }
}
