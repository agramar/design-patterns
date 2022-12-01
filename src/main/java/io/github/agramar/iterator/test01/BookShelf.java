package io.github.agramar.iterator.test01;

import io.github.agramar.iterator.Aggregate;
import io.github.agramar.iterator.Iterator;

import java.util.ArrayList;

// 서가를 나타내는 클래스
public class BookShelf implements Aggregate {
    private final ArrayList<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
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

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
