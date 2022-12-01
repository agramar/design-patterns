package io.github.agramar.iterator.example;

import io.github.agramar.iterator.Iterator;

// 서가를 검색하는 클래스
public class BookShelfIterator implements Iterator {
	private final BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < bookShelf.getLength();
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
