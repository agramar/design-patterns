package kr.co.agramar.factory;

public abstract class Factory {

	// 제품 생성
	public final Product create(String owner) {
		Product product = createProduct(owner);
		registerProduct(product);
		return product;
	}

	// 제품 생성 메소드
	protected abstract Product createProduct(String owner);

	// 제품 등록 메소드
	protected abstract void registerProduct(Product product);
}
