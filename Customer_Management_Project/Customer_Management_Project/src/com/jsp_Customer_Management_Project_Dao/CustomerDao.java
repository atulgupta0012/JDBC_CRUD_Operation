package com.jsp_Customer_Management_Project_Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.jsp_Customer_Management_Project.Customer;

public class CustomerDao {
	Scanner s = new Scanner(System.in);

	// addCustomer method
	public void addCustomer(int customerId, String customerName, String customerEmail, long customerPhone) {
		Connection connection = null;
		try {
			// step-1 load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/customer_management_project";
			String username = "root";
			String password = "Atul@1122334455667788";
			connection = DriverManager.getConnection(url, username, password);
			/*
			 * since we are using preparedStatement insted of Statement. so the normal flow
			 * of program will be diverted
			 */
			String insert = "insert into customer values(?,?,?,?)";

			// step-3 create statement(preparedStatement)
			PreparedStatement preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setInt(1, customerId);
			preparedStatement.setString(2, customerName);
			preparedStatement.setString(3, customerEmail);
			preparedStatement.setLong(4, customerPhone);

			// step-4 execute query
			preparedStatement.execute();
			System.out.println("customer.................added successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// deleteCustomer method
	public void deleteCustomer(int customerId) {

		Connection connection = null;
		try {
			// step-1 load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/customer_management_project";
			String username = "root";
			String password = "Atul@1122334455667788";
			connection = DriverManager.getConnection(url, username, password);
			/*
			 * since we are using preparedStatement insted of Statement. so the normal flow
			 * of program will be diverted
			 */
			String delete = "delete from customer where customerId=?";

			// step-3 create statement(preparedStatement)
			PreparedStatement preparedStatement = connection.prepareStatement(delete);
			preparedStatement.setInt(1, customerId);

			// step-4 execute query
			int id = preparedStatement.executeUpdate();
			if (id != 0) {
				System.out.println("customer.................deleted successfully");
			} else {
				System.out.println("customer............id not present in database");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// updateCustomer method
	public void updateCustomer(int customerId, String customerName, String customerEmail, long customerPhone) {

		Connection connection = null;
		try {
			// step-1 load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/customer_management_project";
			String username = "root";
			String password = "Atul@1122334455667788";
			connection = DriverManager.getConnection(url, username, password);
			/*
			 * since we are using preparedStatement insted of Statement. so the normal flow
			 * of program will be diverted
			 */
			String update = "update  customer set customerName=?,customerEmail=?,customerPhone=? where customerId=?";

			// step-3 create statement(preparedStatement)
			PreparedStatement preparedStatement = connection.prepareStatement(update);
			preparedStatement.setInt(4, customerId);
			preparedStatement.setString(1, customerName);
			preparedStatement.setString(2, customerEmail);
			preparedStatement.setLong(3, customerPhone);

			// step-4 execute query
			int id = preparedStatement.executeUpdate();
			if (id != 0) {
				System.out.println("customer.................updated successfully");
			} else {
				System.out.println("customer id not found in database");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// displayCustomerDetails
	public void displayCustomerDetails(int customerId) {

		Connection connection = null;
		try {
			// step-1 load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/customer_management_project";
			String username = "root";
			String password = "Atul@1122334455667788";
			connection = DriverManager.getConnection(url, username, password);
			/*
			 * since we are using preparedStatement insted of Statement. so the normal flow
			 * of program will be diverted
			 */
			String select = "select * from customer where customerId=?";

			// step-3 create statement(preparedStatement)
			PreparedStatement preparedStatement = connection.prepareStatement(select);
			preparedStatement.setInt(1, customerId);

			// step-4 execute query
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("customerId: " + resultSet.getInt("customerId"));
				System.out.println("customerName: " + resultSet.getString("customerName"));
				System.out.println("customerEmail: " + resultSet.getString("customerEmail"));
				System.out.println("customerPhone: " + resultSet.getLong("customerPhone"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
