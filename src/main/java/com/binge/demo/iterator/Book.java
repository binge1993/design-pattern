package com.binge.demo.iterator;

/**
 * @autor binge
 * @date 2018��5��16��
 */
public class Book {

	/**
	 * ����
	 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", getName()=" + getName() + "]";
	}

}
