package io.github.agramar.templateMethod.example;

// 메소드 display만 구현되고 있는 추상 클래스
public abstract class AbstractDisplay {
	public abstract void open();
	
	public abstract void print();
	
	public abstract void close();
	
	// 추상 클래스에서 구현되고 있는 메소드
	public void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
