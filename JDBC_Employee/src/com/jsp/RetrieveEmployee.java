package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployee {
	public static void main(String[] args) {
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String  url="jdbc:mysql://localhost:3306/simple_jdbc";
			String username="root";
			String pass="Atul@1122334455667788";
			 
			Connection con=DriverManager.getConnection(url,username,pass);
			
			String s="select * from employee";
			Statement statement=con.createStatement();
			ResultSet resultSet=statement.executeQuery(s);
			while(resultSet.next())
			{
				int id=resultSet.getInt(1);
				String name=resultSet.getString(2);
				String  address=resultSet.getString(3);
				System.out.println("Employee id is:"+id);
				System.out.println("Employee name is:"+name);
				System.out.println("Employee address id:"+address);
				System.out.println("=============================================");
			}
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
