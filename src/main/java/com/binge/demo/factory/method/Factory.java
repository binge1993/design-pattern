package com.binge.demo.factory.method;

/**
 * @autor binge
 * @date 2018��5��17��
 */
public abstract class Factory {

	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);

}
