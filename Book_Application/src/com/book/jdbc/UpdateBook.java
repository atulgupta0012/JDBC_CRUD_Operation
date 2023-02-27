package com.book.jdbc;
import java.sql.*;
public class UpdateBook {
public static void main(String[] args) {
	try {
		
		// Load the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Create the connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer-database","root","Atul@1122334455667788");
		
		
		// Create the statement
		
		Statement st=con.createStatement();
		
	    String s="update book set bookName='Python' where bookId=111";
	    
	    st.executeUpdate(s);
	    
	    System.out.println("Book details is updated successfully");
	    
	    
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
