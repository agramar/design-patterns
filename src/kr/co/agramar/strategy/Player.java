package kr.co.agramar.strategy;

public class Player {
    private final String name;
    private final Strategy strategy;

    private int gameCount;
    private int winCount;
    private int loseCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        gameCount++;
        winCount++;
    }

    public void lose() {
        gameCount++;
        loseCount++;
    }

    public void even() {
        gameCount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strategy=" + strategy +
                ", gameCount=" + gameCount +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                '}';
    }
}
