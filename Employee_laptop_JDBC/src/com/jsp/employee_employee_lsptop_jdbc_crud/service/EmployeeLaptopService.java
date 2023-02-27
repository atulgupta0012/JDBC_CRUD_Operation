package com.jsp.employee_employee_lsptop_jdbc_crud.service;

import com.jsp.employee_employee_lsptop_jdbc_crud.dao.LaptopEmployeeDao;
import com.jsp.employee_employee_lsptop_jdbc_crud.dto.Employee;

public class EmployeeLaptopService {
	
	LaptopEmployeeDao dao=new LaptopEmployeeDao();
	public void insertLaptopEmployee(Employee employee)
	{
		dao.insertLaptopEmployee(employee);
	}

}
