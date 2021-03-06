package kr.co.agramar.factoryMethod.example.idcard;

import kr.co.agramar.factoryMethod.example.Product;

public class IDCard extends Product {

	private String owner;

	IDCard(String owner) {
		System.out.println(owner + "의 카드를 만듭니다.");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(owner + "의 카드를 사용합니다.");
	}

	public String getOwner() {
		return owner;
	}

}