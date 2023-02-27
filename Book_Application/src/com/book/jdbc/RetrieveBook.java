package com.book.jdbc;
import java.sql.*;
public class RetrieveBook {
public static void main(String[] args) {
	//load the driver
	
       try {
    	   
    	   // load the driver
    	   Class.forName("com.mysql.cj.jdbc.Driver");
    	   
    	   //Create the connection
    	   
    	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer-database","root","Atul@1122334455667788");
    	   
    	   // Create the statement 
    	   
    	   
    	   Statement st=con.createStatement();
    	   
    	   
    	   
    	   // Write the query
    	   
    	   String s="select * from book";
    	   
    	   ResultSet rs=st.executeQuery(s);
    	   
    	   while(rs.next())
    	   {
    		   int bookId=rs.getInt(1);
    		   String bookName=rs.getString(2);
    		   int bookPrice=rs.getInt(3);
    		   int bookqty=rs.getInt(4);
    		   
    		   System.out.println("The book id is:"+bookId);
    		   System.out.println("The book name is:"+bookName);
    		   System.out.println("The book price is:"+bookPrice);
    		   System.out.println("The book quantity is:"+bookqty);
    	   }
    	   
    	   con.close();
    	   
       }catch(Exception e)
       {
    	   e.printStackTrace();
       }
}
}
