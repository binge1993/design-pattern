package com.binge.demo.factory_method;

import java.util.ArrayList;
import java.util.List;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ17ÈÕ
 */
public class IDFactory extends Factory {

	private List<String> owners = new ArrayList<>();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard) product).getOwner());
	}

	public List<String> getOwners() {
		return owners;
	}

	public void setOwners(List<String> owners) {
		this.owners = owners;
	}

}
