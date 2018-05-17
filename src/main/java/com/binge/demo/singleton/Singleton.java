package com.binge.demo.singleton;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ17ÈÕ
 */
public class Singleton {

	private static final Singleton singleton = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return singleton;
	}

}
