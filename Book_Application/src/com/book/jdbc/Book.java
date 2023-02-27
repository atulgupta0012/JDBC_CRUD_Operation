package com.book.jdbc;
import java.sql.*;
public class Book {
public static void main(String[] args) {
	try {
		
		// Load the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		// Create the connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer-database","root","Atul@1122334455667788");
		
		// Create the statement
		
		Statement st=con.createStatement();
		
		// Create the query
		
		String s="insert into book values(112,'Python',7347,5)";
		
		// Exceute query
		
		st.execute(s);
		
		System.out.println("Book details inserted successfully");
		
		
		con.close();
		
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
