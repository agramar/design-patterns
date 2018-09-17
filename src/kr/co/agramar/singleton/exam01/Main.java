package kr.co.agramar.singleton.exam01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 are same instances");
        } else {
            System.out.println("obj1 and obj2 are different instances");
        }

        System.out.println("End.");
    }
}
