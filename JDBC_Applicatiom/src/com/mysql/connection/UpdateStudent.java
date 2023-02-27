package com.mysql.connection;
import java.sql.*;
public class UpdateStudent {
	public static void main(String[] args) {
		try {
			
			
			
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//Create the connection
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/basic-jdbc","root","Atul@1122334455667788");
			String s="update student set studentName='Aman' where studentId=?";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setInt(1, 123);
			ps.executeUpdate();
			System.out.println("Student data update successfully...");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
