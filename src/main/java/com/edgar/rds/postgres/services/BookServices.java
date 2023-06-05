package com.edgar.rds.postgres.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edgar.rds.postgres.models.Book;
import com.edgar.rds.postgres.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServices {
	
	private final BookRepository bookRepository;
	
	//create
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}
	
	// find by id
	public Book findBookById(Long id) {
		return bookRepository.findById(id).get();
	}
	
	//find all books
	public List<Book> findAllBooks(){
		return bookRepository.findAll();
	}

}
