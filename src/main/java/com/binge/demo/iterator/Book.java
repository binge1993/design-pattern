package com.binge.demo.iterator;

/**
 * @autor binge
 * @date 2018年5月16日
 */
public class Book {

	/**
	 * 书名
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
