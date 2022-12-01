package io.github.agramar.templateMethod.example;

// 메소드 open, print, close를 구현하고 있는 클래스
public class CharDisplay extends AbstractDisplay {
	private char ch;
	
	public CharDisplay (char ch) {
		this.ch = ch;
	}
	
	// 문자열 "<<"을 표시
	@Override
	public void open() {
		System.out.println("<<");
	}

	// 생성자에서 주어진 1문자를 표시
	@Override
	public void print() {
		System.err.println(ch);
	}

	// 문자열 ">>"을 표시
	@Override
	public void close() {
		System.out.println(">>");
	}
}
