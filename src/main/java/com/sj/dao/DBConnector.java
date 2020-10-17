package com.sj.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnector {
	static DBConnector db;
	public DBConnector()
	{
		super();
	}
	
	
	
	public static Connection getInstance()  {
		if(db==null)
          db=new DBConnector();
		return (Connection) db;
	}
	
			// TODO Auto-generated method stub
		
			
			public static Connection getConnection() throws SQLException
			{
				
		
		return( DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","Hrittika1234@"));
	    
	
	}


	
}
		
	
	


