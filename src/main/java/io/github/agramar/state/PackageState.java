package io.github.agramar.state;

public interface PackageState {
    void prev(Package aPackage);

    void next(Package aPackage);

    void printStatus();
}
