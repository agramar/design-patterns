package io.github.agramar.visitor;

public interface Visitor {
    void visit(File file);
    void visit(Directory directory);
}
