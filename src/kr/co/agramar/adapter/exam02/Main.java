package kr.co.agramar.adapter.exam02;

// 위임을 사용한 Adapter 패턴
public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
