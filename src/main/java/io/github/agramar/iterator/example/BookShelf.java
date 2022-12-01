package io.github.agramar.iterator.example;

import io.github.agramar.iterator.Aggregate;
import io.github.agramar.iterator.Iterator;

// 서가를 나타내는 클래스
public class BookShelf implements Aggregate {
	private final Book[] books;
	private int last = 0;
	
	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
