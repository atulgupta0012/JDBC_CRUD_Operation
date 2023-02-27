package com.company.engineer;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class InsertEngineer {
	public static void main(String[] args) {
		try {
			
			// load the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// Create the connection
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer-database","root","Atul@1122334455667788");
			
			Statement st=con.createStatement();
			String s="insert into engineer values(102,'Ramu Singh','Delhi',11101101)";
			
			st.executeUpdate(s);
			
			System.out.println("Table is inseerted successfully...");
		   con.close();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
