package kr.co.agramar.templateMethod.example;

public class Main {
	public static void main(String[] args) {
		// "H"를 가진 CharDisplay 인스턴스를 1개 만든다.
		AbstractDisplay d1 = new CharDisplay('H');
		
		// "Hello, world."를 가진 StringDisplay의 인스턴스를 1개 만든다.
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		
		// "안녕하세요."를 가진 StringDisplay의 인스턴스를 1개 만든다.
		AbstractDisplay d3 = new StringDisplay("안녕하세요.");
		
		d1.display();
		d2.display();
		d3.display();
	}
}
