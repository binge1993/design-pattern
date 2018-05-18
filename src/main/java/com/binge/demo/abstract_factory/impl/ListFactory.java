package com.binge.demo.abstract_factory.impl;

import com.binge.demo.abstract_factory.Factory;
import com.binge.demo.abstract_factory.Link;
import com.binge.demo.abstract_factory.Page;
import com.binge.demo.abstract_factory.Tray;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ18ÈÕ
 */
public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}

}
