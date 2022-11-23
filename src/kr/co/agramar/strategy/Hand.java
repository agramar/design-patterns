package kr.co.agramar.strategy;

import java.util.random.RandomGenerator;

public enum Hand {

    ROCK("바위") {
        @Override
        public int fight(Hand hand) {
            if (hand.equals(SCISSORS)) return 1;
            if (hand.equals(PAPER)) return -1;
            return 0;
        }
    },

    PAPER("보") {
        @Override
        public int fight(Hand hand) {
            if (hand.equals(ROCK)) return 1;
            if (hand.equals(SCISSORS)) return -1;
            return 0;
        }
    },

    SCISSORS("가위") {
        @Override
        public int fight(Hand hand) {
            if (hand.equals(PAPER)) return 1;
            if (hand.equals(ROCK)) return -1;
            return 0;
        }
    };

    private final String name;

    Hand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int fight(Hand hand);


    public static Hand getRandomHand() {
        Hand[] hands = Hand.values();
        return hands[RandomGenerator.getDefault().nextInt(hands.length)];
    }
}
