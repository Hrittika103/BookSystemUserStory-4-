package com.sj.controller;

import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.service.Book;
//import com.sj.service.Book;
import com.sj.service.BookService;

@RestController
@RequestMapping(value="/web")
public class BookController {
	@Autowired
	BookService service;
	/*
	 * @PostMapping("/movies") public Book insertBook(@RequestBody Book b) throws
	 * SQLException { System.out.println(b); return service.createBook(b); }
	 */
	
		
		  @RequestMapping(value="/books") public Book insertBook(Book book) throws
		  SQLException, ClassNotFoundException {
		  
		  return service.createBook(book); }
		 
	@GetMapping(value="/index")
	public String showAll(Model model)
	{
		model.addAttribute("book", BookService.class);
		return "index";
	}

}
