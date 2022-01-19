package com.example.repository;

import com.example.book.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

	Book updateSingleBookById(int id, Book newBook);

	Book updateSingleBookByTitle(String title, Book newBook);

    
}