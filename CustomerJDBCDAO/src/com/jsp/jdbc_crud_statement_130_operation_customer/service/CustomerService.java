package com.jsp.jdbc_crud_statement_130_operation_customer.service;

import java.util.List;

import com.jsp.jdbc_crud_statement_130_operation_customer.dao.CustomerDao;
import com.jsp.jdbc_crud_statement_130_operation_customer.dto.Customer;

public class CustomerService {

	
	CustomerDao customerDao=new CustomerDao();
	/*
	 * 
	 */
	public  int getById(int id)
	{
		int id2=customerDao.getByInt(id);
		return id2;
	}
	
	
	public void insertCustomer(Customer customer)
	{
		customerDao.insertCustomer(customer);
	}
	
	
	// Delete
	
	
	public void deleteCustomer(int id) {
		int id1 = customerDao.getByInt(id);
		
		if (id1 == id) {
			customerDao.deleteCustomer(id);

		} else {
			System.out.println("Given Id is not present");
		}

	}
	
	
	
	
	//update 
	
	public void updateCustomer(String name,int id)
	{
		int id1=customerDao.getByInt(id);
		if(id1==id)
		{
		   customerDao.updateCustomer(name, id1);
		}
		
		else
		{
			  System.out.println("The given id is not present");
		}
	}
	
	
	//  select 
	
	
	public List<Customer> displayCustomer()
	{
		 return customerDao.displayCustomer();
	}
}
