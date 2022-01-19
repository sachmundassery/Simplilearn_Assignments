package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.models.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	public Book findOneBookByTitle(String title);
	
	public Book findOneBookByPublishedYear(int year);
}
