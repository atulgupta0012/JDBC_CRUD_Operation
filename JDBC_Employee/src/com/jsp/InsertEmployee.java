package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertEmployee {
	public static void main(String[] args) {
		try
		{
			
			
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create the connection
		      String url="jdbc:mysql://localhost:3306/simple_jdbc";
		      String username="root";
		      String password="Atul@1122334455667788";
			Connection con=DriverManager.getConnection(url,username,password);
			
			
			String s="insert into employee values(103,'Saurabh Chuhan','Delhi')";
			// Create the  statement
			
			Statement st=con.createStatement();
			st.execute(s);
			System.out.println("Employee data is inserted successfully..");
			con.close();
			
		}catch(Exception e)
		{
			
			e.printStackTrace();
		}
		
		    
	}

}
