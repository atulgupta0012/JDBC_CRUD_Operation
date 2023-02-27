package com.company.engineer;

import java.sql.DriverManager;
import java.sql.*;

public class DeleteEngineer {
	public static void main(String[] args) {
		try {
			
			//  load the Driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create the connection
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer-database","root","Atul@1122334455667788");
			
			
			
			Statement st=con.createStatement();
			
			String s="delete from engineer where eid=101";
			
			st.executeUpdate(s);
			System.out.println("Enginner data deleted sucesfully..");
			
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
