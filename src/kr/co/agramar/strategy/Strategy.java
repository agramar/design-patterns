package kr.co.agramar.strategy;

public interface Strategy {
    Hand nextHand();
    default void study(boolean win) {};
}
