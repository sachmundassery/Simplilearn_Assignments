package com.springboot;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.models.Book;
import com.springboot.service.BookService;

@RestController
@RequestMapping("/books/")
public class LibraryController {

    private final BookService bookService;

    @Autowired
    public LibraryController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("all")
    public String getAllBooks() {
        return bookService.getAllBooks().stream().map(b -> b.getTitle() + "\n").collect(Collectors.joining());
    }

    @GetMapping("{id}")
    public String getBookById(@PathVariable int id) {
        return bookService.getSingleBookById(id).toString();
    }

    @PostMapping("create")
    public String createBook() {
        for (int i = 0; i < 10; i++) {
            Book b = new Book();
            b.setTitle("Book " + (i + 1));
            b.setDescription("This is the description of book numbered: " + (i + 1));
            b.setPublishedYear(Integer.parseInt("201" + i));
            bookService.save(b);
        }

        return "10 Books created";
    }

    @PutMapping("update/id/{id}")
    public Book updateBookById(@PathVariable int id, @RequestBody Book newBook) {
        return bookService.updateSingleBookById(id, newBook);
    }

    @PutMapping("update")
    public Book updateBookByTitle(@RequestParam String title, @RequestBody Book newBook) {
        return bookService.updateSingleBookByTitle(title, newBook);
    }

    @GetMapping("bookbyyear/{year}")
    public Book findBookByPublishedYear(@PathVariable int year) {
        return bookService.findSingleBookByYearPublished(year);
    }

    @DeleteMapping("delete/{id}")
    public Book deleteBookById(@PathVariable int id) {
        return bookService.deleteBookById(id);
    }

    @DeleteMapping("delete/all")
    public void deleteAllBooks() {
        bookService.deleteAllBooks();
    }


}
