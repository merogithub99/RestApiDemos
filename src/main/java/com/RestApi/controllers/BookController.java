package com.RestApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.models.Book;
import com.RestApi.services.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Book> getBooks() {

		return this.bookService.getAllBook();
	}
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookService.getBookById(id);
		
	}
	@PostMapping("/books")
	public Book addBooks(@RequestBody Book book) {
		book=this.bookService.addBook(book);
		System.out.println(book);
		return book;
	}

}
