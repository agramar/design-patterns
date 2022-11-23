package kr.co.agramar.visitor;

public class ListVisitor implements Visitor {

    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        directory.iterator().forEachRemaining(entry -> entry.accept(this));
        currentDir = saveDir;
    }
}
