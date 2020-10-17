package com.sj.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sj.service.Book;
@Service
public class BookDao {
	
	public BookDao() throws ClassNotFoundException
		{
	
			
				Class.forName("com.mysql.cj.jdbc.Driver");
	}
	public  Book insertBook(Book book) throws SQLException{
	
		 try {
			 
			 Connection con = DBConnector.getConnection();
			 String query =("insert into books values(?,?,?,?)");//insert new data each time while running the program
			 PreparedStatement ps=  con.prepareStatement(query);
			 ps.setInt(1, 96);
			 ps.setString(2, "uoABxjC");
			 ps.setString(3, "DopGHdl");
			 ps.setDouble(4, 5692);
			 ps.executeUpdate();
			 PreparedStatement ps1=con.prepareStatement("select * from books");
			 ResultSet user1=ps1.executeQuery();
			 while(user1.next())
			 {
				 System.out.println(+user1.getInt(1)+","+user1.getString(2)+","+user1.getString(3)+","+user1.getDouble(4));
			 }
			 return book;
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 return null;
		 }
	}
}

			