package io.github.agramar.abstractFactory;

import io.github.agramar.abstractFactory.factory.Factory;
import io.github.agramar.abstractFactory.factory.Item;

public class Main {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage : java Main class.name.of.ConcreteFactory");
			System.out.println("Example 1: java Main listfactory.ListFactory");
			System.out.println("Example 2: java Main tablefactory.TableFactory");
			System.exit(0);
		}

		Factory factory = Factory.getFactory(args[0]);
		Item item = factory.createTray("tray");
	}
}
