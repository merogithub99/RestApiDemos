package com.RestApi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.RestApi.models.Book;

@Service
public class BookService {

	private static List<Book> list = new ArrayList<>();

	static {
		list.add(new Book(1, "java", "Sushant"));
		list.add(new Book(2, "Dsa", "ram"));
		list.add(new Book(3, "Numerical Methods", "Hari"));

	}

	public List<Book> getAllBook() {
		return list;
	}

	 public Book getBookById(int id) {
	        Book book = list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
	        return book;
	    }
	 public Book addBook(Book b) {
		 
		list.add(b);
		 return b;
		
		 
	 }

}
