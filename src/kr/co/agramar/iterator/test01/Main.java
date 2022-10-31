package kr.co.agramar.iterator.test01;


import kr.co.agramar.iterator.Iterator;

/**
 * 문제 : java.util.ArrayList를 이용해 서가의 크기를 초과해도 책을 추가할 수 있도록 만들어보자
 */
// 동작 테스트용 클래스
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("Elegant Universe"));
        bookShelf.appendBook(new Book("Fall in Love"));
        bookShelf.appendBook(new Book("Global"));
        bookShelf.appendBook(new Book("Highness"));
        bookShelf.appendBook(new Book("Internet"));
        bookShelf.appendBook(new Book("Jenkins"));

        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
