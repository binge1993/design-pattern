package com.binge.test.singleton;

import com.binge.demo.singleton.Singleton;

/**
 * @autor binge
 * @date 2018年5月17日
 */
public class SingletonTest {
	public static void main(String[] args) {
		System.out.println("Strart.");

		Singleton o1 = Singleton.getInstance();
		Singleton o2 = Singleton.getInstance();
		if (o1 == o2) {
			System.out.println("o1 与 o2是同个实例");
		} else {
			System.out.println("o1 与 o2是不同实例");
		}

		System.out.println("End.");
	}
}
