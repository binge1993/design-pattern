package com.binge.demo.template_method;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ17ÈÕ
 */
public class CharDisplay extends AbstractDisplay {

	private char ch;

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	protected void open() {
		System.out.print("<<");
	}

	@Override
	protected void print() {
		System.out.print(ch);
	}

	@Override
	protected void close() {
		System.out.println(">>");
	}

}
