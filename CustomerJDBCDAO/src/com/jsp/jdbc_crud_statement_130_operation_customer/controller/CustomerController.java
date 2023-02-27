package com.jsp.jdbc_crud_statement_130_operation_customer.controller;
import java.util.*;


import com.jsp.jdbc_crud_statement_130_operation_customer.dto.Customer;
import com.jsp.jdbc_crud_statement_130_operation_customer.service.CustomerService;

public class CustomerController {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		CustomerService service=new CustomerService();
		Customer customer=new Customer();
		
		while(true)
		{
			System.out.println(" 1.Insert \n 2.GetById \n 3.Delete \n 4.Update \n 5.Display \n 6.Exit");
			System.out.println("Enter your choice:");
			
			int choies =sc.nextInt();
			
			switch(choies)
			{
			case 1:{
				System.out.println("enter the insert data:");
				System.out.println(" 1.customerId \n 2.customerName \n 3.customerEmaill \n 4.customerAdderss \n 5.customerMobile");
				int customerId=sc.nextInt();
				String customerName=sc.next();
				String customerEmail=sc.next();
				String customerAdderss=sc.next();
				
				int customerMobile=sc.nextInt();
				
				customer.setCustomerId(customerId);
				customer.setCustomerName(customerName);
				customer.setCustomerEmail(customerEmail);
				customer.setCustomerAddress(customerAdderss);
				customer.setCustomerMobile(customerMobile);
				
				service.insertCustomer(customer);		
			}break;
			
			case 2:{
				System.out.println("Enter the customerId to fetch the details");
				int id=sc.nextInt();
				service.getById(id);
			}break;
			
			case 3:{
				System.out.println("Enter the customerId to delete");
				int id = sc.nextInt();
				service.deleteCustomer(id);
				
			}break;
			
			case 4:{
				System.out.println("Enter cusyomer id to update teacher name");
				int id=sc.nextInt();
				System.out.println("Ente teacher name to upadte");
				String name=sc.next();
				name+=sc.nextLine();
				service.updateCustomer(name, id);
				
			}break;
			
			case 5:{
List<Customer> list=service.displayCustomer();
				
				for (Customer cust : list) {
					
					
					System.out.println("Customer id is:"+customer.getCustomerId());
					System.out.println("Customer name is:"+customer.getCustomerName());
					System.out.println("Customer Email is:"+customer.getCustomerEmail());
					System.out.println("customer address is:"+customer.getCustomerAddress());
					System.out.println("customer mobile is:"+customer.getCustomerMobile());
					
					System.out.println("............................................");
				}
			}break;
			
			case 6:{
				
			}break;
			}
		}
	}
	

}
