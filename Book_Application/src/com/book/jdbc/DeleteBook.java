package com.book.jdbc;
import java.sql.*;
public class DeleteBook {
public static void main(String[] args) {
	// load the driver
	try {
		
		
		
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	
	// Create the connection
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer-database","root","Atul@1122334455667788");
	
	
	String s="Delete  from book where bookId=111";
	Statement st=con.createStatement();
	st.executeUpdate(s);
	System.out.println("Book details deleted successfully....");
	
	con.close();
	
	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
}
}
