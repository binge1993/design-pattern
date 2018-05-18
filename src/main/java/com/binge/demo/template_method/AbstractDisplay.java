package com.binge.demo.template_method;

/**
 * @autor binge
 * @date 2018��5��17��
 */
public abstract class AbstractDisplay {

	protected abstract void open();

	protected abstract void print();

	protected abstract void close();

	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
