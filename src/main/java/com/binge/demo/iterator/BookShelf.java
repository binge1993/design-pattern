package com.binge.demo.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ���
 * 
 * @autor binge
 * @date 2018��5��16��
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
	 * ����λ�û�ȡ�鼮
	 * 
	 * @param index
	 * @return
	 */
	public Book getBookAt(int index) {
		checkIndex(index);

		return books.get(index);
	}

	/**
	 * Խ����
	 * 
	 * @param index
	 */
	private void checkIndex(int index) {
		if (index < 0 || index >= books.size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	/**
	 * ����鼮
	 * 
	 * @param book
	 * @return
	 */
	public boolean appendBook(Book book) {
		books.add(book);
		return true;
	}

	/**
	 * ��ȡ����
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
