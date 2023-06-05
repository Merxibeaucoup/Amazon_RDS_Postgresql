package com.edgar.rds.postgres.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edgar.rds.postgres.models.Book;
import com.edgar.rds.postgres.services.BookServices;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
	
	private final BookServices bookService;
	
	
	//create book
	@PostMapping("/create")
	public ResponseEntity<Book> saveBook(@RequestBody Book book){	
		return ResponseEntity.ok(bookService.createBook(book));
		
	}
	
	//findby id
	@GetMapping("/{id}")
	public ResponseEntity<Book> getById(@PathVariable Long id){	
		return ResponseEntity.ok(bookService.findBookById(id));
		
	}
	
	//find all 
		@GetMapping("/all")
		public ResponseEntity<List<Book>> getAll(){	
			return ResponseEntity.ok(bookService.findAllBooks());
			
		}
	
	

}
