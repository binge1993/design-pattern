package com.binge.demo.abstract_factory.impl;

import com.binge.demo.abstract_factory.Link;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ18ÈÕ
 */
public class ListLink extends Link {

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
	}

}
