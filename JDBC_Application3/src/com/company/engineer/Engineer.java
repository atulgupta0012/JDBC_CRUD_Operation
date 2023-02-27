package com.company.engineer;

import java.sql.*;

public class Engineer {
	public static void main(String[] args) {
		try {
			
		// Step-1 - Load the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//  Step-2 Create the Connection
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer-database","root","Atul@1122334455667788");
			
			
			//   Step -3 Create the statement
			
			Statement st=con.createStatement();
			
			//   Stept-4  Write the query
			
			String s="create table engineer(eid int(20), ename varchar(20), eaddress varchar(30), emobno int(12)  )";
			
			// Step-5 Execute the query
			st.execute(s);
			
			System.out.println("Table is created....");
			
			///Step 6  Close the connection
			
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
