package com.jsp.employee_employee_lsptop_jdbc_crud.dao;

import com.jsp.employee_employee_lsptop_jdbc_crud.connection.JdbcConnection;
import com.jsp.employee_employee_lsptop_jdbc_crud.dto.Employee;
import java.sql.*;

public class LaptopEmployeeDao {
	Connection connection=null;
	
	
	// Insert method laptop employee
	public void insertLaptopEmployee(Employee employee)
	{
		PreparedStatement preparedStatement =null;
		connection=JdbcConnection.getJdbcConnection();
		String insertLaptopQuery="insert into laptop values(?,?,?,?)";
		String insertEmployeeQuery="insert into employee values(?,?,?,?)";
		try
		{
		preparedStatement=connection.prepareStatement(insertLaptopQuery);
		preparedStatement.setInt(1, employee.getLaptop().getLaptopSerialNumber());
	  preparedStatement.setString(2,employee.getLaptop().getLaptopName() );
	  preparedStatement.setString(3,employee.getLaptop().getLaptopMemory());
	  preparedStatement.setDouble(4,employee.getLaptop().getLaptopPrice());
	  preparedStatement.execute();
	  System.out.println("Laptop........ Data........Inserted.....");
	  
	  
	 preparedStatement=connection.prepareStatement(insertEmployeeQuery);
	 preparedStatement.setInt(1, employee.getEmployeeId());
	 preparedStatement.setString(2, employee.getEmployeeName());
	 preparedStatement.setString(3, employee.getEmployeeEmail());
	 preparedStatement.setInt(4, employee.getLaptop().getLaptopSerialNumber());
	 
	  System.out.println("Employee.......Data.......Inserted.......");
		
	}catch(SQLException e)
		{
		      e.printStackTrace();
		}finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
}
