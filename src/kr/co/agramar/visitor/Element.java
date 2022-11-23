package kr.co.agramar.visitor;

public interface Element {
    void accept(Visitor v);
}