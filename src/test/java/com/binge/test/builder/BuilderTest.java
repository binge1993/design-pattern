package com.binge.test.builder;

import com.binge.demo.builder.Person;

/**
 * @autor binge
 * @date 2018��5��18��
 */
public class BuilderTest {
	public static void main(String[] args) {
		Person person = new Person.Builder().setName("binge").setAge(25).setAddr("FuZhou").setPhone("123456").build();
		System.out.println(person);
	}
}
