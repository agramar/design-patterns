package kr.co.agramar.memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("State : " + gamer);

            gamer.bet();

            System.out.println("Total Money : " + gamer.getMoney());

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("Save Current State");
                memento = gamer.createMemento();
            } else {
                System.out.println("Restore Previous State");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("====");
        }
    }
}
