package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateEmployee {
	public static void main(String[] args) {
		
		
		try
		{
			
			// Load the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create the connection
			String url="jdbc:mysql://localhost:3306/simple_jdbc";
			String username="root";
			String pass="Atul@1122334455667788";
			Connection con=DriverManager.getConnection(url,username,pass);
			
			String s="create table employee(empid int(20),ename varchar(15),eaddress varchar(30))";
			
			Statement st=con.createStatement();
			st.executeUpdate(s);
			
			System.out.println("Table is created..");
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
