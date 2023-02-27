package com.qsp.jdbc_statement_130_crud_operation.controller;

import com.qsp.jdbc_statement_130_crud_operation.dao.CustomerDao;
import com.qsp.jdbc_statement_130_crud_operation.dto.Customer;

public class CustomerController {
  public static void main(String[] args) {
	CustomerDao customerDao=new CustomerDao();
	Customer customer=new Customer();
	
	customer.setCustomerId(125);
	customer.setCustomerName("Golu");
	customer.setCustomerEmail("golu@gmail.com");
	customer.setCustomerAddress("Lucknow");
	customer.setCustomerMobile(900090098);
	customerDao.insertCustomer(customer);
}
}
