package com.binge.test.singleton;

import com.binge.demo.singleton.Singleton;

/**
 * @autor binge
 * @date 2018��5��17��
 */
public class SingletonTest {
	public static void main(String[] args) {
		System.out.println("Strart.");

		Singleton o1 = Singleton.getInstance();
		Singleton o2 = Singleton.getInstance();
		if (o1 == o2) {
			System.out.println("o1 �� o2��ͬ��ʵ��");
		} else {
			System.out.println("o1 �� o2�ǲ�ͬʵ��");
		}

		System.out.println("End.");
	}
}
