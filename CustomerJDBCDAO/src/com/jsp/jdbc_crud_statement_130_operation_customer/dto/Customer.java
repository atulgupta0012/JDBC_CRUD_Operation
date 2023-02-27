package com.jsp.jdbc_crud_statement_130_operation_customer.dto;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerEmail;
	private String customerAddress;
	private int customerMobile;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public long getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(int customerMobile) {
		this.customerMobile = customerMobile;
	}
	

}
