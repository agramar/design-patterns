package kr.co.agramar.singleton.test02;

public class Main {
    public static void main(String[] args) {
        Triple triple00 = Triple.getInstance(0);
        Triple triple01 = Triple.getInstance(0);
        Triple triple10 = Triple.getInstance(1);
        Triple triple11 = Triple.getInstance(1);
        Triple triple20 = Triple.getInstance(2);
        Triple triple21 = Triple.getInstance(2);

        if (triple00 == triple01) {
            System.out.println("triple00 and triple01 are same");
        }
        if (triple10 == triple11) {
            System.out.println("triple10 and triple11 are same");
        }
        if (triple20 == triple21) {
            System.out.println("triple20 and triple21 are same");
        }

    }
}
