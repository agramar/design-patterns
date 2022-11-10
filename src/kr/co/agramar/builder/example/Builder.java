package kr.co.agramar.builder.example;

public interface Builder {
	void makeTitle(String title);
	void makeString(String str);
	void makeItems(String[] items);
	void close();
}
