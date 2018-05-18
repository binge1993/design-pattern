package com.binge.demo.abstract_factory;

/**
 * @autor binge
 * @date 2018��5��18��
 */
public abstract class Factory {

	public static Factory getFactory(String className) {
		Factory factory = null;
		try {
			factory = (Factory) Class.forName(className).newInstance();
		} catch (ClassNotFoundException e) {
			System.err.println("û���ҵ�" + className + "�ࡣ");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return factory;
	}

	public abstract Link createLink(String caption, String url);

	public abstract Tray createTray(String caption);

	public abstract Page createPage(String title, String author);

}
