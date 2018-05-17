package com.binge.demo.adapter;

import java.io.IOException;

/**
 * �ļ������ӿ�
 * 
 * @autor binge
 * @date 2018��5��17��
 */
public interface FileIO {

	/**
	 * ���ļ���ȡ����
	 * 
	 * @param filename
	 * @throws IOException
	 */
	void readFromFile(String filename) throws IOException;

	/**
	 * ������д���ļ�
	 * 
	 * @param filename
	 * @throws IOException
	 */
	void writeToFile(String filename) throws IOException;

	/**
	 * ����ֵ
	 * 
	 * @param key
	 * @param value
	 */
	void setValue(String key, String value);

	/**
	 * ��ȡֵ
	 * 
	 * @param key
	 * @return
	 */
	String getValue(String key);
}
