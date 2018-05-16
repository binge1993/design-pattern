package com.binge.demo.iterator;

/**
 * 迭代器
 * 
 * @autor binge
 * @date 2018年5月16日
 */
public interface Iterator<T> {
	/**
	 * 是否有下一个元素
	 * 
	 * @return
	 */
	boolean hasNext();

	/**
	 * 返回当前元素，并指向下个元素
	 * 
	 * @return
	 */
	T next();
}
