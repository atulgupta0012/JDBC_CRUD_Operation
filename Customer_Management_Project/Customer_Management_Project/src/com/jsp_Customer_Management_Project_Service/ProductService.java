package com.jsp_Customer_Management_Project_Service;

import java.util.Scanner;

import com.jsp_Customer_Management_Project.Product;
import com.jsp_Customer_Management_Project_Dao.CustomerDao;
import com.jsp_Customer_Management_Project_Dao.ProductDao;

public class ProductService {
	Scanner s = new Scanner(System.in);

	// customer login method
	public void customerLogin(int customerId, long customerPhone) {
		ProductDao productDao = new ProductDao();
		if ((productDao.customerId(customerId) == customerId)
				&& ((productDao.customerPhone(customerPhone) == customerPhone))) {
			System.out.println("welcome to customer Dashboard");
			while (true) {

				System.out.println();
				System.out.println(
						"1.addProduct\n2.updateProduct\n3.deleteProduct\n4.updateProductPrice\n5.updateProductAvailable\n6.displayCustomerDetails\n7.displayProductDetails\n8.Logout");
				System.out.println("Enter your choice: ");
				int choice = s.nextInt();
				switch (choice) {
				case 1: {

					Product product = new Product();
					System.out.println("Enter product price: ");
					double productPrice = s.nextDouble();
					if (productPrice <= 7000) {
						product.setProductPrice(productPrice);

						System.out.println("Enter productId: ");
						int productId = s.nextInt();
						product.setProductId(productId);
						System.out.println("Enter productName: ");
						String productName = s.next();
						productName += s.nextLine();
						product.setProductName(productName);

						System.out.println("Enter productAvailability: ");
						boolean productAvailability = s.nextBoolean();
						product.setProductAvailable(productAvailability);
						ProductDao productDao1 = new ProductDao();
						productDao1.insertProduct(product);
					} else {
						System.out.println(
								"product cost is greater than selected range.so you can not add this product in database");
					}
				}
					break;

				case 2: {

					Product product = new Product();
					System.out.println("Enter productId: ");
					int productId = s.nextInt();
					product.setProductId(productId);
					System.out.println("Enter productName: ");
					String productName = s.next();
					productName += s.nextLine();
					product.setProductName(productName);
					System.out.println("Enter product price: ");
					double productPrice = s.nextDouble();
					product.setProductPrice(productPrice);
					System.out.println("Enter productAvailability: ");
					boolean productAvailability = s.nextBoolean();
					product.setProductAvailable(productAvailability);
					ProductDao productDao1 = new ProductDao();
					productDao1.updateProduct(product);
				}
					break;

				case 3: {
					System.out.println("Enter productId: ");
					int productId = s.nextInt();
					ProductDao productDao1 = new ProductDao();
					productDao1.deleteProduct(productId);
				}
					break;
				case 4: {
					System.out.println("Enter productId: ");
					int productId = s.nextInt();
					System.out.println("Enter productPrice: ");
					double productPrice = s.nextDouble();
					ProductDao productDao1 = new ProductDao();
					productDao1.updateProductPrice(productId, productPrice);
				}
					break;
				case 5: {
					System.out.println("Enter productId: ");
					int productId = s.nextInt();
					System.out.println("Enter productAvailable: ");
					boolean productAvailable = s.nextBoolean();
					ProductDao productDao1 = new ProductDao();
					productDao1.updateProductAvailable(productId, productAvailable);
				}
					break;
				case 6: {
					CustomerDao customerDao = new CustomerDao();
					System.out.println("Enter customerId: ");
					int customeId = s.nextInt();
					customerDao.displayCustomerDetails(customerId);
				}
					break;
				case 7: {
					System.out.println("Enter productId: ");
					int productId = s.nextInt();
					ProductDao productDao1 = new ProductDao();
					if (productDao1.displayProductDetails(productId) == productId) {

					} else {
						System.out.println("product id not found in database");
					}
				}
					break;
				case 8: {
					System.out.println("Logout.............successfully");
					System.exit(choice);
				}
					break;

				default: {
					System.out.println("invalid choice");
				}
				}
			}
		} else {
			System.out.println("invalid credential!!!");
		}
	}
}
