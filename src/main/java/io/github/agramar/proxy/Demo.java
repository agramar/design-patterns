package io.github.agramar.proxy;

public class Demo {
    public static void main(String[] args) {
        Service service = new ServiceProxy();
        service.process();
        service.process();
    }
}
