package com.mysql.connection;
import java.sql.*;
public class Student {
	public static void main(String[] args) {
		try
		{
			
			// load the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create the connection 
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/basic-jdbc","root","Atul@1122334455667788");
			
			String s="insert into student values(123,'Ramu',123456)";
			Statement st=con.createStatement();
			st.execute(s);
			System.out.println("Table inserted succesfully...");
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
