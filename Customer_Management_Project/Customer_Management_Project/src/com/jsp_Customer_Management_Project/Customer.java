package com.jsp_Customer_Management_Project;

public class Customer {
private int customerId;
private String customerName;
private String customerEmail;
private long customerPhone;
private Product product;
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
public long getCustomerPhone() {
	return customerPhone;
}
public void setCustomerPhone(long customerPhone) {
	this.customerPhone = customerPhone;
}

}
