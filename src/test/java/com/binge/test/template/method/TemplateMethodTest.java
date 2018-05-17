package com.binge.test.template.method;

import com.binge.demo.template.method.AbstractDisplay;
import com.binge.demo.template.method.CharDisplay;
import com.binge.demo.template.method.StringDisplay;

/**
 * @autor binge
 * @date 2018��5��17��
 */
public class TemplateMethodTest {
	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, world.");

		AbstractDisplay d3 = new StringDisplay(" ��ã����硣");

		d1.display();
		d2.display();
		d3.display();
	}
}
