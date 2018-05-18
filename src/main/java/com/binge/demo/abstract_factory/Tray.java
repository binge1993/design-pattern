package com.binge.demo.abstract_factory;

import java.util.ArrayList;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ18ÈÕ
 */
public abstract class Tray extends Item {
	protected ArrayList tray = new ArrayList();

	public Tray(String caption) {
		super(caption);
		this.tray = tray;
	}

	public void add(Item item) {
		tray.add(item);
	}
}
