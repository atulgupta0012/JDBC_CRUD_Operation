package com.jsp.jdbc_crud_statement_operation.dto;

import java.sql.*;
import com.jsp.jdbc_crud_statement_operation.dto.Teacher;
public class TeacherDao {
	
		public void insertTeacher(Teacher teacher)
		{
			Connection con=null;
			try {
				
				//load the driver
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// Create the connection
				
				
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer-database","root","Atul@1122334455667788");
				Statement st=con.createStatement();
				String s="insert into teacher values("+teacher.getTeacherId()+",'"+teacher.getTeacherName()+"','"+teacher.getTeacherEmail()+"','"+teacher.getTeacherSubject()+"')";
				st.executeUpdate(s);
				System.out.println("Teacher data inserted successfully......");
				 
				
				
			}catch(Exception e)
			
			{
	                  e.printStackTrace();
			}
			
			
			
		
		
	}

}
