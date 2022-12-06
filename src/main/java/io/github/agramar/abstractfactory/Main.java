package io.github.agramar.abstractfactory;

import io.github.agramar.abstractfactory.factory.Factory;
import io.github.agramar.abstractfactory.factory.Item;

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
