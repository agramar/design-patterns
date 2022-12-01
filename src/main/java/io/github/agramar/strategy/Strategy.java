package io.github.agramar.strategy;

public interface Strategy {
    Hand nextHand();
    default void study(boolean win) {};
}
