package com.binge.demo.abstract_factory;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ18ÈÕ
 */
public abstract class Item {
	protected String caption;

	public Item(String caption) {
		this.caption = caption;
	}

	public abstract String makeHTML();
}
