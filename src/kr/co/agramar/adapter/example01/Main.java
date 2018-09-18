package kr.co.agramar.adapter.example01;

// 상속을 사용한 Adapter 패턴
// Client
public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
