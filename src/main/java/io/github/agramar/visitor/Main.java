package io.github.agramar.visitor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        rootDir.add(binDir).add(tmpDir).add(usrDir);
        binDir.add(new File("vi", 10000)).add(new File("latex", 20000));
        rootDir.accept(new ListVisitor());

        System.out.println();
        System.out.println("Making user entries...");
        Directory kimDir = new Directory("kim");
        Directory leeDir = new Directory("lee");
        Directory parkDir = new Directory("park");
        usrDir.add(kimDir).add(leeDir).add(parkDir);
        kimDir.add(new File("diary.html", 100));
        kimDir.add(new File("compile.java", 200));
        leeDir.add(new File("memo.txt", 300));
        parkDir.add(new File("game.exe", 400));
        parkDir.add(new File("junk.html", 600));
        rootDir.accept(new ListVisitor());
    }
}
