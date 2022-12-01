package io.github.agramar.singleton.test03;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("create instance");
        slowDown();
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowDown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
