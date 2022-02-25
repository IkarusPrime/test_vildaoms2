package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookRepository bookrepository;
	
	public Iterable<Book> queryBooksFromArray() {
		
		//System.out.println ("Books" + books);
		
		return bookrepository.findAll();
	}
	
	public Book addBookToH2(Book book) {
		
		bookrepository.save(book);
		
		return book;
	}
	
}
