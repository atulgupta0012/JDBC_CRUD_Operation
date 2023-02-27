package com.mysql.student;

import java.sql.*;

public class DeleteCustomer 
{
	public static void main(String[] args) {
	try {
		
		//load the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Create the connection 
		
		String url="jdbc:mysql://localhost:3306/customer-database";
		
		String username="root";
		String password="Atul@1122334455667788";
		
		Connection con=DriverManager.getConnection(url, username, password);
		
		String s="delete from customer where customerId=1234";
		
		Statement st=con.createStatement();
		int id=st.executeUpdate(s);
		if(id!=0)
		{
	           System.out.println("Customer data is deleted");
		}
		
		else
		{
			System.out.println("Customer data is not deleted...");
		}
		
		System.out.println("Customer table is deleted successfully...");
		
		con.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}