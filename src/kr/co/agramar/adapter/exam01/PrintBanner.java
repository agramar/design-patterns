package kr.co.agramar.adapter.exam01;

// Target
public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}
}
