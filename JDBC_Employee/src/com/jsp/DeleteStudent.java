package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteStudent {
	public static void main(String[] args) {
		try
		{
			// load the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/simple_jdbc";
			String username="root";
			String pass="Atul@1122334455667788";
			Connection con=DriverManager.getConnection(url,username,pass);
			
			String s="delete from employee where empid=103";
			
			Statement st=con.createStatement();
			st.executeUpdate(s);
			System.out.println("Employee data is deleted successully...");
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
