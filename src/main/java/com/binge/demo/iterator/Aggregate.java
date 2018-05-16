package com.binge.demo.iterator;

/**
 * 集合
 * 
 * @autor binge
 * @date 2018年5月16日
 */
public interface Aggregate<T> {

	/**
	 * 获取迭代器
	 * 
	 * @return
	 */
	Iterator<T> iterator();
}
