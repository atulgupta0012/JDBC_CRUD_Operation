package com.mysql.student;

import java.sql.*;

public class UpdateCustomer {
	
	      public static void main(String args[])
	      {
	    	   try {
	    		   
	    		   //load the driver
	    		   
	    		   Class.forName("com.mysql.cj.jdbc.Driver");
	    		   
	    		   //  Create the connection 
	    		   
	    		   String url="jdbc:mysql://localhost:3306/customer-database";
	    		   
	    		   String username="root";
	    		   String password="Atul@1122334455667788";
	    		   
	    		   
	    		   Connection con=DriverManager.getConnection(url, username, password);
	    		   
	    		   String s="update customer set customerName='Rohit' where customerId=12345";
	    		   Statement st=con.createStatement();
	    		   
	    		int id=   st.executeUpdate(s);
	    		
	    		if(id!=0)
	    		{
	    		   
	    		   System.out.println("Customer data is modified....");
	    		}
	    		else
	    		{
	    			System.out.println("Customer data is not modified...");
	    		}
	    		   
	    		   con.close();
	    		   
	    		   
	    	   }catch(Exception e)
	    	   {
	    		   e.printStackTrace();
	    	   }
	      }
	}


