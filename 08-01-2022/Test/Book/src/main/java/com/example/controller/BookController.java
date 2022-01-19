package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.Book;
import com.example.repository.BookRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("books")
public class BookController {

	@Autowired
	BookRepository bookRepository;

	@GetMapping("all")
	public List<Book> getAllBook() {
		List<Book> book = (List<Book>) bookRepository.findAll();
		return book;
	}

	@GetMapping("book/{id}")
	public Optional<Book> getbookId(@PathVariable int id) {
		return bookRepository.findById(id);
	}

	@GetMapping("book/{published}")
	public Optional<Book> getbookpublishedyear(@PathVariable int published) {
		return bookRepository.findById(published);
	}

	@PostMapping("create")
	public String createBook() {
		for (int i = 0; i < 10; i++) {
			Book b = new Book();
			b.setId(Integer.parseInt("1" + i));
			b.setTitle("Book " + (i + 1));
			b.setDescription("This is the description of book numbered: " + (i + 1));
			b.setPublished(Integer.parseInt("201" + i));
			bookRepository.save(b);
		}

		return "10 Books created";
	}

	@PutMapping("update/id/{id}")
	public Book updateBookById(@PathVariable int id, @RequestBody Book newBook) {
		return bookRepository.updateSingleBookById(id, newBook);
	}
	
	@PutMapping("update")
	public Book updateBookByTitle(@RequestParam String title, @RequestBody Book newBook) {
		return bookRepository.updateSingleBookByTitle(title, newBook);
	}

	@DeleteMapping("delete/{id}")
	public void deletebook(@PathVariable int id)
	{
		bookRepository.deleteById(id);
	}
	
	// delete all book from database
		@DeleteMapping("all")
		public void deleteAllbook()
		{
			bookRepository.deleteAll();
		}

}
