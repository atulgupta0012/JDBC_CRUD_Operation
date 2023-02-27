package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateEmployee {
	public static void main(String[] args) {
		try
		{
			
			// Load the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create the connection
			
			String url="jdbc:mysql://localhost:3306/simple_jdbc";
			String username="root";
			String password="Atul@1122334455667788";
			
			Connection connection=DriverManager.getConnection(url,username,password);
			
		String s="update employee set ename='Raju singh' where empid=101";
		
		
		// Cratte the statement
	      Statement st=connection.createStatement();
	      st.executeUpdate(s);
	      System.out.println("Employee data is updated...");
	      connection.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
