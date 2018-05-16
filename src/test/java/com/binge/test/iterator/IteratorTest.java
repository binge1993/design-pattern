package com.binge.test.iterator;

import com.binge.demo.iterator.Book;
import com.binge.demo.iterator.BookShelf;
import com.binge.demo.iterator.Iterator;

/**
 * @autor binge
 * @date 2018Äê5ÔÂ16ÈÕ
 */
public class IteratorTest {

	public static void main(String[] args) {

		BookShelf bookShelf = new BookShelf();
		Book book1 = new Book();
		book1.setName("book1");

		Book book2 = new Book();
		book2.setName("book2");

		Book book3 = new Book();
		book3.setName("book3");

		Book book4 = new Book();
		book4.setName("book4");

		bookShelf.appendBook(book1);
		bookShelf.appendBook(book3);
		bookShelf.appendBook(book4);
		bookShelf.appendBook(book2);

		Iterator<Book> it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			System.out.println(book);
		}

	}
}
