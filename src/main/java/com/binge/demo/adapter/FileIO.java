package com.binge.demo.adapter;

import java.io.IOException;

/**
 * 文件操作接口
 * 
 * @autor binge
 * @date 2018年5月17日
 */
public interface FileIO {

	/**
	 * 从文件读取内容
	 * 
	 * @param filename
	 * @throws IOException
	 */
	void readFromFile(String filename) throws IOException;

	/**
	 * 把内容写入文件
	 * 
	 * @param filename
	 * @throws IOException
	 */
	void writeToFile(String filename) throws IOException;

	/**
	 * 设置值
	 * 
	 * @param key
	 * @param value
	 */
	void setValue(String key, String value);

	/**
	 * 获取值
	 * 
	 * @param key
	 * @return
	 */
	String getValue(String key);
}
