package kr.co.agramar.iterator.test01;

import java.util.ArrayList;

// 서가를 나타내는 클래스
public class BookShelf {
	private ArrayList<Book> books;
	
	public BookShelf() {
		this.books = new ArrayList<Book>();
	}
	
	public BookShelf(int initialSize) {
		this.books = new ArrayList<Book>(initialSize);
	}
	
	public Book getBookAt(int index) {
		return books.get(index);
	}
	
	public void appendBook(Book book) {
		this.books.add(book);
	}
	
	public int getLength() {
		return this.books.size();
	}
	
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
