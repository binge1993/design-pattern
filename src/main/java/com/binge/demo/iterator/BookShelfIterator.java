package com.binge.demo.iterator;

import java.util.List;

/**
 * ��ܵ�����
 * 
 * @autor binge
 * @date 2018��5��16��
 */
public class BookShelfIterator<T> implements Iterator<T> {

	private int index = 0;

	BookShelf bookShelf;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}

	@Override
	public boolean hasNext() {
		return index < bookShelf.getLenth();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T next() {
		List<Book> books = bookShelf.getBooks();
		return (T) books.get(index++);
	}

}
