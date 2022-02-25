package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id; 
	private String title;
	private String author;
	private int pages;
	//private int year;
	private String isbn;

	
	public Book () {}
	
	public Book(String title, String author, int pages, String isbn ) {
		super();
		this.title = title;
		this.author = author;
		this.pages = pages;
	//	this.year = year;
		this.isbn = isbn;	
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	/*
	 * public int getYear() { return year; } public void setYear(int year) {
	 * this.year = year; }
	 */

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pages=" + pages + ", year="  + ", ISBN=" + isbn
				+ "]";
	}
}
