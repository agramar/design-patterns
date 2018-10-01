package kr.co.agramar.builder.example;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("At morning and afternoon");
		builder.makeItems(new String[] { "Good morning.", "Good afternoon." });
		builder.makeString("At night");
		builder.makeItems(new String[] { "Good morning.", "Good night.", "Good bye."});
		builder.close();
	}
}
