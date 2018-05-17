package com.binge.test.prototype;

import com.binge.demo.prototype.Product;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ17ÈÕ
 */
public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Product p = new Product();
		p.setName("aaa");

		Product p2 = p.clone();
		System.out.println(p2.getName());
	}
}
