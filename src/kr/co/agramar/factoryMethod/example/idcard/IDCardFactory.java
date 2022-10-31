package kr.co.agramar.factoryMethod.example.idcard;

import java.util.ArrayList;
import java.util.List;

import kr.co.agramar.factoryMethod.example.Factory;
import kr.co.agramar.factoryMethod.example.Product;

public class IDCardFactory extends Factory {
	
	private final List<String> owners = new ArrayList<>();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	
	public List<String> getOwners() {
		return owners;
	}

}
