package com.mysql.student;

import java.sql.*;
public class Customer {
	public static void main(String[] args) {
		try {
			
			// load the driver
			
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
	    //Create the connection 
	    
	    String url="jdbc:mysql://localhost:3306/customer-database";
	    String username="root";
	    String password="Atul@1122334455667788";
	    Connection con=DriverManager.getConnection(url, username, password);
	    
	    String s="insert into customer values(123456,'Shivm Singh','shivam121@gmail.com')";
	    Statement st=con.createStatement();
	 
	    System.out.println("Customer data inserted successfully");
	    con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
