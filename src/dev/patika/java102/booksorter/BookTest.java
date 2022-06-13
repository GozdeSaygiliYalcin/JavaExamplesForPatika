package dev.patika.java102.booksorter;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class BookTest {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.addFirst(null);
		
		TreeSet<Book> bookList = new TreeSet<Book>();
		
		bookList.add(new Book("Harry Potter", "JK Rowling", 312, null));
		bookList.add(new Book("Lord of the Rings", "JRR Tolkien", 567, null));
		bookList.add(new Book("Little Prince", "Antoine de Saint-Exupéry", 120, null));
		bookList.add(new Book("Flow", "Mihaly Csikszentmihalyi", 450, null));
		bookList.add(new Book("Anne with an 'E'", "Lucy Maud Montgomery", 300, null));
		bookList.comparator();
		
		 for (Book book:bookList) {
	            System.out.printf("Book Name: %-23s Page: %4d\n", book.getBookName(), book.getPageNumber());
	        }
		 
		System.out.println("=============================================");
		
		TreeSet<Book> newBookList=new TreeSet<>(new Comparator<Book>() {
			  @Override
	            public int compare(Book b1, Book b2) {
	                return b1.getPageNumber() - b2.getPageNumber();
	            }
	        });
		
		newBookList.addAll(bookList);
		for (Book book:newBookList) {
            System.out.printf("Book Name: %-23s Page: %4d\n", book.getBookName(), book.getPageNumber());
        }
	}
}
