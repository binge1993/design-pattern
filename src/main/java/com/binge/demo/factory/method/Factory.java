package com.binge.demo.factory.method;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ17ÈÕ
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
