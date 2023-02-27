package com.jsp.employee_employee_lsptop_jdbc_crud.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	Connection connection=null;
	
		public static Connection getJdbcConnection()
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				String url="jdbc:mysql://localhost:3306/employee_laptop_jdbc";
				String user="root";
				String pass="Atul@1122334455667788";
				return DriverManager.getConnection(url,user,pass);
			} catch (ClassNotFoundException|SQLException e) {
				// 
				e.printStackTrace();
			}
			return null;
			
		}
		}


