package io.github.agramar.proxy;

public class ServiceImpl implements Service {

    public ServiceImpl() {
        heavyInitialConfiguration();
    }

    private void heavyInitialConfiguration() {
        System.out.println("Loading initial configuration...");
    }

    @Override
    public void process() {
        System.out.println("processing complete.");
    }
}
