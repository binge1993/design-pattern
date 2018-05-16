package com.binge.demo.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 书架
 * 
 * @autor binge
 * @date 2018年5月16日
 */
public class BookShelf implements Aggregate<Book> {

	private List<Book> books;

	public BookShelf() {
		this.books = new ArrayList<>();
	}

	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator<Book>(this);
	}

	/**
	 * 根据位置获取书籍
	 * 
	 * @param index
	 * @return
	 */
	public Book getBookAt(int index) {
		checkIndex(index);

		return books.get(index);
	}

	/**
	 * 越界检查
	 * 
	 * @param index
	 */
	private void checkIndex(int index) {
		if (index < 0 || index >= books.size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	/**
	 * 添加书籍
	 * 
	 * @param book
	 * @return
	 */
	public boolean appendBook(Book book) {
		books.add(book);
		return true;
	}

	/**
	 * 获取长度
	 * 
	 * @return
	 */
	public int getLenth() {
		return books.size();
	}

	public List<Book> getBooks() {
		return books;
	}

}
