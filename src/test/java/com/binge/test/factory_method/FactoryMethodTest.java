package com.binge.test.factory_method;

import com.binge.demo.factory_method.Factory;
import com.binge.demo.factory_method.IDCard;
import com.binge.demo.factory_method.IDFactory;
import com.binge.demo.factory_method.Product;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ17ÈÕ
 */
public class FactoryMethodTest {
	public static void main(String[] args) {
		Factory f = new IDFactory();

		Product p1 = f.create("binge1");
		Product p2 = f.create("binge2");
		Product p3 = f.create("binge3");

		p1.use();
		p2.use();
		p3.use();
	}
}
