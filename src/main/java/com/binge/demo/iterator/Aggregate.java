package com.binge.demo.iterator;

/**
 * ����
 * 
 * @autor binge
 * @date 2018��5��16��
 */
public interface Aggregate<T> {

	/**
	 * ��ȡ������
	 * 
	 * @return
	 */
	Iterator<T> iterator();
}
