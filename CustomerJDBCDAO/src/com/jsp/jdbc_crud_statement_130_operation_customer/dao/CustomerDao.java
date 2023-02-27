package com.jsp.jdbc_crud_statement_130_operation_customer.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.jsp.jdbc_crud_statement_130_operation_customer.dto.Customer;
public class CustomerDao {
	

	

		public void insertCustomer(Customer customer)
		{
			Connection conn=null;
			try {
			//1	
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2
			String url="jdbc:mysql://localhost:3306/customer-database";
			String user="root";
			String password="Atul@1122334455667788";
			
			conn = DriverManager.getConnection(url, user, password);
			//3
			Statement statment = conn.createStatement();
			//4
			String insert="insert into customer2 values("+customer.getCustomerId()+",'"+customer.getCustomerName()+"','"+customer.getCustomerEmail()+"','"+customer.getCustomerAddress()+"',"+customer.getCustomerMobile()+")";
			
			statment.execute(insert);
			
			System.out.println("inserted-successfully....");
		}
			catch (ClassNotFoundException |SQLException e) {
				
				e.printStackTrace();
				// TODO: handle exception
			}
			
			finally
			{
				try
				{	
					conn.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
	}
		

		public int getByInt(int id)
		{
			Connection conn=null;
			int id1=0;
			try {
				//1
				Class.forName("com.mysql.cj.jdbc.Driver");
				//2
				String url="jdbc:mysql://localhost:3306/customer-database";
				String user="root";
				String password="Atul@1122334455667788";
				
				conn=DriverManager.getConnection(url, user, password);
				//3
				Statement statment =conn.createStatement()	;	
				//4
				String select=" select * from customer2 where customerId="+id+" ";
				//GetById
				ResultSet resultSet=statment.executeQuery(select);
				
				while(resultSet.next())
				{
					id1=resultSet.getInt("customerId");
					
					System.out.println("customerId="+id1);
					System.out.println("customerName="+resultSet.getString("customerName"));
					System.out.println("customerEmail="+resultSet.getString("customerEmail"));
					System.out.println("customerAddress="+resultSet.getString("customerAddress"));
					System.out.println("customerMobile="+resultSet.getInt("customerMobile"));

				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return id1;
		}
		
		
		// Delete customer details
		
		public void deleteCustomer(int id)
		{
			Connection connection=null;
			try
			{
				
				// Load the driver
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				// Create the connectioon
				String url="jdbc:mysql://localhost:3306/customer-database";
				String username="root";
				String password="Atul@1122334455667788";
				
				
				// Cretae the statememt
				if(username.equals("root")&&password.equals("Atul@1122334455667788"))
				{
					connection=DriverManager.getConnection(url,username,password);
					Statement statement=connection.createStatement();
					String s="delete from customer where customerId="+id+"";
					statement.executeUpdate(s);
					System.out.println("Teacher data is deleted successfully...");
					
					
					
				}
				
				else
				{
					System.out.println("Connection is not esatblished...");
				}
				
				
				
				
				
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}finally
			{
				try
				{
				connection.close();
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			
		}
		
		
		
		
		       // Update tecaher
		
		public void updateCustomer(String name,int id)
		{
			Connection connection=null;
			try
			{
				// load the driver
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// create the connection
				
				
				
			  String url="jdbc:mysql://localhost:3306/customer-database";
			  String username="root";
			  String password="Atul@1122334455667788";
			  
			  //  Step 3 Create the state,ent
			  
			  if(username.equals("root")&&password.equals("Atul@1122334455667788"))
			  {
				  connection=DriverManager.getConnection(url,username,password);
				  
				  
				  //Step 4
				  Statement statement=connection.createStatement();
				  String update="update customer set customerName='"+name+"' where customerId="+id+"";
				  statement.execute(update);
				  System.out.println("Data updated successfully..");
			  }
			  
			  else
			  {
				  System.out.println("Comnection is not establisshed..");
			  }
			  
			  
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		// Display  Customer Details
		
		
		public List<Customer> displayCustomer(){
			
			Connection connection = null;
			try {
				
				//step-1 Load the Driver 
				Class.forName("com.mysql.cj.jdbc.Driver");
				//step-2 Create the connection
				String url="jdbc:mysql://localhost:3306/customer-database";
				String username="root";
				String password = "Atul@1122334455667788";
				
				//step-3 Create the Statement
				
				if(username.equals("root")&&password.equals("Atul@1122334455667788")) {
					
					connection=DriverManager.getConnection(url, username, password);
					Statement statement = connection.createStatement();
					//step-4 Execute the Query
					String select = "Select * From customer";
					
					ResultSet resultSet=statement.executeQuery(select);
					
					List<Customer> customers = new ArrayList<Customer>();
					
					while(resultSet.next()) {
						
						int id = resultSet.getInt("customerId");
						String name = resultSet.getString("customerName");
						String email = resultSet.getString("customerEmail");
						String address = resultSet.getString("customerAddress");
						int mobile=resultSet.getInt("customermobile");
						
						Customer customer = new Customer ();
						
						customer.setCustomerId(id);
						customer.setCustomerName(name);
						customer.setCustomerEmail(email);
						customer.setCustomerMobile(mobile);
						customer.setCustomerAddress(address);
						
					}
					
					return customers;
					
				}else {
					System.out.println("Connection is not established");
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return null; 
		
		
		
	}
		
}



