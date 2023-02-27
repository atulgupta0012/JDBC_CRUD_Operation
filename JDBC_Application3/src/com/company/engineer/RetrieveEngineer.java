package com.company.engineer;

import java.sql.DriverManager;
import java.sql.*;
public class RetrieveEngineer {
	public static void main(String[] args) {
		try {
			
			// load the driver
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create the connection
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer-database","root","Atul@1122334455667788");
			
			
			Statement st=con.createStatement();
			String s="select * from engineer";
			
			ResultSet rs=st.executeQuery(s);
			while(rs.next())
			{
			   int id=rs.getInt(1);
			   String name=rs.getString(2);
			   String address=rs.getString(3);
			   
			   int mno=rs.getInt(4);
			   
			   System.out.println("id is:"+id);
			   System.out.println("name is:"+name);
			   System.out.println("address is:"+address);
			   System.out.println("Mobile no is:"+mno);
			   System.out.println("===============================");
			   
			}
			
			con.close();
		
	}catch(Exception e)
		{
		       e.printStackTrace();
		}
	}
}

