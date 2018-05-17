package com.binge.demo.singleton;

/**
 * @autor binge
 * @date 2018��5��17��
 */
public class Singleton {

	private static final Singleton singleton = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return singleton;
	}

}
