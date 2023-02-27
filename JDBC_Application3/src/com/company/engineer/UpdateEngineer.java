package com.company.engineer;

import java.sql.DriverManager;
import java.sql.*;
public class UpdateEngineer {
	public static void main(String[] args) {
		try {
			
			// Load the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create the connection
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer-database","root","Atul@1122334455667788");
			
			Statement st=con.createStatement();
			String s="update engineer set ename='Aman singh' where eid=101";
			st.executeUpdate(s);
			
			System.out.println("Table is modified...");
			
			con.close();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
