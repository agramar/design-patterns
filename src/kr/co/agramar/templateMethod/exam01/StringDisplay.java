package kr.co.agramar.templateMethod.exam01;

// 메소드 open, print, close를 구현하고 있는 클래스
public class StringDisplay extends AbstractDisplay {
	private String str;
	private int width;
	
	public StringDisplay(String str) {
		this.str = str;
		this.width = str.getBytes().length;
	}

	// 문자열 "+----+"을 표시
	@Override
	public void open() {
		printLine();
	}

	// 생성자에서 주어진 문자열을 "|"와 "|"사이에 표시한다.
	@Override
	public void print() {
		System.out.println("|" + str + "|");
	}

	// 문자열 "+----+"을 표시
	@Override
	public void close() {
		printLine();
	}
	
	public void printLine() {
		System.out.print("+");
		for (int i = 0; i < width ; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
}
