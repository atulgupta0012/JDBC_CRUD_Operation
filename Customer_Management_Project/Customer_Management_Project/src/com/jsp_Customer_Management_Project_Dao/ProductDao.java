package com.jsp_Customer_Management_Project_Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp_Customer_Management_Project.Product;

public class ProductDao {

// customerId return method
	public int customerId(int customerId) {
		int id1 = 0;
		Connection connection = null;
		try {
			// step-1 load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/Customer_Management_Project";
			String username = "root";
			String password = "Atul@1122334455667788";
			connection = DriverManager.getConnection(url, username, password);
			/*
			 * since we are using prepared statement hence normal flow of program will be
			 * diverted
			 */
			String select = "select  customerId from customer where customerId=?";
			// step-3 create statement(preparedStatement)
			PreparedStatement preparedStatement = connection.prepareStatement(select);
			preparedStatement.setInt(1, customerId);

			// step-4 execute query
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				id1 = resultSet.getInt("customerId");
			}
			return id1;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// step-5 close connection
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return id1;
	}

// customerPhone return method
	public long customerPhone(long customerPhone) {

		long id1 = 0;
		Connection connection = null;
		try {
			// step-1 load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/Customer_Management_Project";
			String username = "root";
			String password = "Atul@1122334455667788";
			connection = DriverManager.getConnection(url, username, password);
			/*
			 * since we are using prepared statement hence normal flow of program will be
			 * diverted
			 */
			String select = "select  customerPhone from customer where customerPhone=?";
			// step-3 create statement(preparedStatement)
			PreparedStatement preparedStatement = connection.prepareStatement(select);
			preparedStatement.setLong(1, customerPhone);

			// step-4 execute query
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				id1 = resultSet.getInt("customerPhone");
			}
			return id1;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// step-5 close connection
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return id1;
	}

	// insertProduct by customer
	public void insertProduct(Product product) {
		Connection connection = null;
		try {
			// step-1 load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/Customer_Management_Project";
			String username = "root";
			String password = "Atul@1122334455667788";
			connection = DriverManager.getConnection(url, username, password);
			/*
			 * since we are using prepared statement hence normal flow of program will be
			 * diverted
			 */
			String insert = "insert into product values(?,?,?,?)";
			// step-3 create statement(preparedStatement)
			PreparedStatement preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setInt(1, product.getProductId());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setDouble(3, product.getProductPrice());
			preparedStatement.setBoolean(4, product.getProductAvailable());

			// step-4 execute query
			preparedStatement.execute();
			System.out.println("product.............inserted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// step-5 close connection
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// updateProduct by customer
	public void updateProduct(Product product) {
		Connection connection = null;
		try {
			// step-1 load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/Customer_Management_Project";
			String username = "root";
			String password = "Atul@1122334455667788";
			connection = DriverManager.getConnection(url, username, password);
			/*
			 * since we are using prepared statement hence normal flow of program will be
			 * diverted
			 */
			String update = "update  product set productName=?,productPrice=?,productAvailable=? where productId=?";
			// step-3 create statement(preparedStatement)
			PreparedStatement preparedStatement = connection.prepareStatement(update);
			preparedStatement.setInt(4, product.getProductId());
			preparedStatement.setString(1, product.getProductName());
			preparedStatement.setDouble(2, product.getProductPrice());
			preparedStatement.setBoolean(3, product.getProductAvailable());

			// step-4 execute query
			int id = preparedStatement.executeUpdate();
			if (id != 0) {
				System.out.println("product.............updated");
			} else {
				System.out.println("product id is not present in database");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// step-5 close connection
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// deleteProduct
	public void deleteProduct(int productId) {

		Connection connection = null;
		try {
			// step-1 load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/Customer_Management_Project";
			String username = "root";
			String password = "Atul@1122334455667788";
			connection = DriverManager.getConnection(url, username, password);
			/*
			 * since we are using prepared statement hence normal flow of program will be
			 * diverted
			 */
			String delete = "delete  from product where productId=?";
			// step-3 create statement(preparedStatement)
			PreparedStatement preparedStatement = connection.prepareStatement(delete);
			preparedStatement.setInt(1, productId);

			// step-4 execute query
			int id = preparedStatement.executeUpdate();
			if (id != 0) {
				System.out.println("product.............deleted");
			} else {
				System.out.println("product id is not present in database");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// step-5 close connection
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// updateProductPrice method
	public void updateProductPrice(int productId, double productPrice) {

		Connection connection = null;
		try {
			// step-1 load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/Customer_Management_Project";
			String username = "root";
			String password = "Atul@1122334455667788";
			connection = DriverManager.getConnection(url, username, password);
			/*
			 * since we are using prepared statement hence normal flow of program will be
			 * diverted
			 */
			String update = "update  product set productPrice=? where productId=?";
			// step-3 create statement(preparedStatement)
			PreparedStatement preparedStatement = connection.prepareStatement(update);
			preparedStatement.setInt(2, productId);
			preparedStatement.setDouble(1, productPrice);

			// step-4 execute query
			int id = preparedStatement.executeUpdate();
			if (id != 0) {
				System.out.println("product............price updated");
			} else {
				System.out.println("product id is not present in database");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// step-5 close connection
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// updateProductAvailable method
	public void updateProductAvailable(int productId, boolean productAvailable) {

		Connection connection = null;
		try {
			// step-1 load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/Customer_Management_Project";
			String username = "root";
			String password = "Atul@1122334455667788";
			connection = DriverManager.getConnection(url, username, password);
			/*
			 * since we are using prepared statement hence normal flow of program will be
			 * diverted
			 */
			String update = "update  product set productAvailable=? where productId=?";
			// step-3 create statement(preparedStatement)
			PreparedStatement preparedStatement = connection.prepareStatement(update);
			preparedStatement.setInt(2, productId);
			preparedStatement.setBoolean(1, productAvailable);

			// step-4 execute query
			int id = preparedStatement.executeUpdate();
			if (id != 0) {
				System.out.println("product status.............updated");
			} else {
				System.out.println("product id is not present in database");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// step-5 close connection
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// displayProductDetails method
	public int displayProductDetails(int productId) {
		int id1 = 0;
		Connection connection = null;
		try {
			// step-1 load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step-2 create connection
			String url = "jdbc:mysql://localhost:3306/Customer_Management_Project";
			String username = "root";
			String password = "Atul@1122334455667788";
			connection = DriverManager.getConnection(url, username, password);
			/*
			 * since we are using prepared statement hence normal flow of program will be
			 * diverted
			 */
			String select = "select * from   product  where productId=?";
			// step-3 create statement(preparedStatement)
			PreparedStatement preparedStatement = connection.prepareStatement(select);
			preparedStatement.setInt(1, productId);

			// step-4 execute query
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				id1 = resultSet.getInt("productId");
				System.out.println("productId: " + resultSet.getInt("productId"));
				System.out.println("productName: " + resultSet.getString("productName"));
				System.out.println("productPrice: " + resultSet.getDouble("productPrice"));
				System.out.println("productAvailable: " + resultSet.getBoolean("productAvailable"));
			}
			return id1;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		// step-5 close connection
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return id1;
	}

}
