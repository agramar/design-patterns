package io.github.agramar.factoryMethod.example;

import io.github.agramar.factoryMethod.example.idcard.IDCardFactory;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		
		Product card1 = factory.create("Song");
		Product card2 = factory.create("Tak");
		Product card3 = factory.create("Park");
		
		card1.use();
		card2.use();
		card3.use();
	}
}
