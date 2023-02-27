package com.jsp.employee_employee_lsptop_jdbc_crud.controller;

import com.jsp.employee_employee_lsptop_jdbc_crud.dto.Employee;
import com.jsp.employee_employee_lsptop_jdbc_crud.dto.Laptop;
import com.jsp.employee_employee_lsptop_jdbc_crud.service.EmployeeLaptopService;

public class EmployeeLaptopController {
	public static void main(String[] args) {
              EmployeeLaptopService employeeLaptopService=new EmployeeLaptopService();
              Laptop laptop=new Laptop();
              Employee employee=new Employee();
              laptop.setLaptopSerialNumber(111);
              laptop.setLaptopName("Dell");
              laptop.setLaptopMemory("8GB");
              laptop.setLaptopPrice(434737);
              
              
              employee.setEmployeeId(23232);
              employee.setEmployeeName("Atul gupta");
              employee.setEmployeeEmail("atul@gamil.com");
              employee.setLaptop(laptop);
              
              employeeLaptopService.insertLaptopEmployee(employee);
              
              
              
 	}

}
