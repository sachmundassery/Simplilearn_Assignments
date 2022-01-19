package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.Book;
import com.springboot.repository.BookRepository;

@Service
public class BookService {
	private final BookRepository br;
	
	@Autowired
	public BookService(BookRepository br) {
		this.br = br;
	}

	
	public List<Book> getAllBooks() {
		List<Book> result = new ArrayList<>();
		
		br.findAll()
			.forEach(result::add);
		
		System.out.println(result);
		
		return result;
	}
	
	public Book getSingleBookById(int id) {
		return br.findById(id).get();
	}
	
	public Book updateSingleBookById(int id, Book newBook) {
		Book oldBook = br.findById(id).get();
		oldBook.setDescription(newBook.getDescription());
		oldBook.setTitle(newBook.getTitle());
		oldBook.setPublishedYear(newBook.getPublishedYear());
		br.save(oldBook);
		return newBook;
	}
	
	public Book updateSingleBookByTitle(String title, Book newBook) {
		Book oldBook = br.findOneBookByTitle(title);
		oldBook.setDescription(newBook.getDescription());
		oldBook.setTitle(newBook.getTitle());
		oldBook.setPublishedYear(newBook.getPublishedYear());
		br.save(oldBook);
		return newBook;
	}
	
	public Book findSingleBookByYearPublished(int year) {
		return br.findOneBookByPublishedYear(year);
	}
	
	public Book deleteBookById(int id) {
		Book book = br.findById(id).get();
		br.deleteById(id);
		return book;
	}
	
	public void deleteAllBooks() {
		br.deleteAll();
	}

	public void save(Book book) {
		br.save(book);
	}
}
