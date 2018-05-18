package com.binge.demo.abstract_factory;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ18ÈÕ
 */
public abstract class Link extends Item {
	protected String url;

	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}

}
