package com.mysql.student;
import java.sql.*;
public class SelectCustomer {
public static void main(String[] args) {
	try {
		
		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		// create the connection 
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer-database","root","Atul@1122334455667788");
		Statement st=con.createStatement();
		
		String select ="select * from customer";
		  ResultSet rs=st.executeQuery(select);
		  System.out.println("id     name     mailid");
		
		
		  while(rs.next())
		  {
			  int id=rs.getInt(1);
			  String name=rs.getString(2);
		      String mailid=rs.getString(3);
		      System.out.println("-----------------------------------");
			  
			 
			  
			  
			System.out.print(id+"  ");
			System.out.print(name+"  ");
			System.out.print(mailid+"  ");
			
			System.out.println();
			  
		  }
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
