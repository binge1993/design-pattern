package com.binge.demo.abstract_factory;

/**
 * @autor binge
 * @date 2018��5��18��
 */
public abstract class Link extends Item {
	protected String url;

	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}

}
