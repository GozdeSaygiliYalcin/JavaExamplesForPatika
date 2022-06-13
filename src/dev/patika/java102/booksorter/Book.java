package dev.patika.java102.booksorter;

import java.time.LocalDate;


public class Book implements Comparable<Book> {

	String bookName;
	String author;
	int pageNumber;
	LocalDate publishDate;


	public Book(String bookName, String author, int pageNumber, LocalDate publishDate) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.pageNumber = pageNumber;
		this.publishDate = publishDate;
	}

	public String getBookName() {
		return this.bookName;
	}
	
	public String getAuthor() {
		return this.author;
	}

	public int getPageNumber() {
		return this.pageNumber;
	}

	public LocalDate getPublishDate() {
		return this.publishDate;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + this.bookName + ", author=" + this.author + ", pageNumber=" + this.pageNumber
				+ ", publishDate=" + this.publishDate + "]";
	}

	@Override
	public int compareTo(Book o1) {
		// TODO Auto-generated method stub
		return (this.getBookName()).compareTo(o1.getBookName());
	}
	

}