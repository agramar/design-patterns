package io.github.agramar.visitor;

public interface Element {
    void accept(Visitor v);
}