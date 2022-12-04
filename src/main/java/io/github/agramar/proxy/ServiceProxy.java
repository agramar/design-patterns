package io.github.agramar.proxy;

public class ServiceProxy implements Service {

    private Service service;

    @Override
    public void process() {
        if (service == null) {
            service = new ServiceImpl();
        }
        service.process();
    }
}
