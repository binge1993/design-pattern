package com.binge.demo.prototype;

/**
 * @autor binge
 * @date 2018��5��17��
 */
public class Product implements Prototype {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Product clone() throws CloneNotSupportedException {
		return (Product) super.clone();
	}

}
