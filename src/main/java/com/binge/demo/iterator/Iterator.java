package com.binge.demo.iterator;

/**
 * ������
 * 
 * @autor binge
 * @date 2018��5��16��
 */
public interface Iterator<T> {
	/**
	 * �Ƿ�����һ��Ԫ��
	 * 
	 * @return
	 */
	boolean hasNext();

	/**
	 * ���ص�ǰԪ�أ���ָ���¸�Ԫ��
	 * 
	 * @return
	 */
	T next();
}
