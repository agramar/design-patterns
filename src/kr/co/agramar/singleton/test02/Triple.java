package kr.co.agramar.singleton.test02;

/**
 * 인스턴스 개수가 3개로 한정되어 있는 클래스
 */
public class Triple {
    private static Triple[] triple = {new Triple(), new Triple(), new Triple()};

    private Triple() {
        System.out.println("create instance");
    }

    public static Triple getInstance(int id) {
        System.out.println("return Triple" + id);
        return triple[id];
    }
}
