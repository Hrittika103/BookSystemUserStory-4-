package com.sj.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.dao.BookDao;


@Service
public class OnlineBookService implements BookService {
	@Autowired
	BookDao dao;

	@Override
	public Book createBook(Book book) throws SQLException
	{
		
	
			return dao.insertBook(book);
	
	

}

}