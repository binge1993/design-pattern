package com.binge.demo.adapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ17ÈÕ
 */
public class FileProperties implements FileIO {
	private Properties properties = new Properties();

	@Override
	public void readFromFile(String filename) throws IOException {
		File file = new File(filename);
		if (!file.exists()) {
			throw new IOException("file not exist :" + filename);
		}

		FileInputStream input = new FileInputStream(file);
		properties.load(input);
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		File file = new File(filename);
		properties.store(new FileOutputStream(file), "");
	}

	@Override
	public void setValue(String key, String value) {
		properties.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return properties.getProperty(key);
	}

}
