package kr.co.agramar.visitor;

public interface Visitor {
    void visit(File file);
    void visit(Directory directory);
}
