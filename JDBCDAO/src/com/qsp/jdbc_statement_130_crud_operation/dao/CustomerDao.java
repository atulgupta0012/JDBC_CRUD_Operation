package com.qsp.jdbc_statement_130_crud_operation.dao;

import com.qsp.jdbc_statement_130_crud_operation.dto.Customer;
import java.sql.*;

// this class for db communication

public class CustomerDao {
	Connection connection=null;
	public void insertCustomer(Customer customer)
	{
		try
		{
			// load the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create he connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer-database","root","Atul@1122334455667788");
			Statement statement=connection.createStatement();
			
			String insert="insert into customer1 values("+customer.getCustomerId()+",'"+customer.getCustomerName()+"','"+customer.getCustomerEmail()+"','"+customer.getCustomerAddress()+"','"+customer.getCustomerMobile()+"')";
		  statement.execute(insert);
		  System.out.println("Data is inserted succesfully...");
		}catch(ClassNotFoundException |SQLException e)
		{
		
                e.printStackTrace();		
		}
		
		finally
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
	}


