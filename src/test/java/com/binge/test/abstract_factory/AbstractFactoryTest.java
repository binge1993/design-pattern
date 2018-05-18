package com.binge.test.abstract_factory;

import com.binge.demo.abstract_factory.Factory;
import com.binge.demo.abstract_factory.Link;
import com.binge.demo.abstract_factory.Page;
import com.binge.demo.abstract_factory.Tray;

/**
 * @autor binge
 * @date 2018年5月18日
 */
public class AbstractFactoryTest {
	public static void main(String[] args) {

		Factory factory = Factory.getFactory("com.binge.demo.abstract_factory.impl.ListFactory");

		Link people = factory.createLink("人民日报", "tttt");
		Link gmw = factory.createLink("光明日报", "aaa");

		Tray trayNews = factory.createTray("日报");
		trayNews.add(people);
		trayNews.add(gmw);

		Page page = factory.createPage("LinkPage", "binge");
		page.add(trayNews);
		page.output();
	}

}
