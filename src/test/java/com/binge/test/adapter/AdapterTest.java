package com.binge.test.adapter;

import java.io.IOException;

import com.binge.demo.adapter.FileProperties;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ17ÈÕ
 */
public class AdapterTest {

	public static void main(String[] args) throws IOException {
		FileProperties props = new FileProperties();
		props.readFromFile("E:\\OpenDemo\\design-pattern\\src\\test\\java\\com\\binge\\test\\adapter\\test.properties");

		System.out.println(props.getValue("test1"));
		System.out.println(props.getValue("test2"));
		System.out.println(props.getValue("test3"));

		props.setValue("test2", "bbb");

		props.writeToFile("E:\\OpenDemo\\design-pattern\\src\\test\\java\\com\\binge\\test\\adapter\\test1.properties");
	}
}
