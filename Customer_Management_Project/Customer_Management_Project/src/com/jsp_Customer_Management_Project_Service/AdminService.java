package com.jsp_Customer_Management_Project_Service;

import java.util.Scanner;
import com.jsp_Customer_Management_Project.Admin;
import com.jsp_Customer_Management_Project_Dao.AdminDao;
import com.jsp_Customer_Management_Project_Dao.CustomerDao;

public class AdminService {
	// insertAdmin method
	public void insertAdmin(Admin admin) {
		AdminDao adminDao = new AdminDao();
		int adminId = admin.getAdminId();
		if (adminDao.getById(adminId) == adminId) {
			System.out.println("this Admin id is already present in database.please chose different Admin id");
		} else {
			adminDao.insertAdmin(admin);
		}
	}

	// updateAdmin method
	public void updateAdmin(int adminId, String adminName, String adminEmail) {
		AdminDao adminDao = new AdminDao();
		if (adminDao.getById(adminId) == adminId) {
			adminDao.updateAdmin(adminId, adminName, adminEmail);
		} else {
			System.out.println("Admin id not present in database");
		}
	}

	// deleteAdmin method
	public void deleteAdmin(int adminId) {
		AdminDao adminDao = new AdminDao();
		if (adminDao.getById(adminId) == adminId) {
			adminDao.deleteAdmin(adminId);
		} else {
			System.out.println("Admin id is not present in database or already deleted");
		}
	}

	// loginAdmin method
	public void loginAdmin(String adminName, String adminEmail) {
		AdminDao adminDao = new AdminDao();
		if (adminDao.adminName(adminName) == adminDao.adminEmail(adminEmail)) {
			System.out.println("welcome to Admin Dashboard");
			while (true) {
				System.out.println("1.Addcustomer\n2.Deletecustomer\n3.Updatecustomer\n4.Logout");
				System.out.println("Enter your choice: ");
				Scanner s = new Scanner(System.in);
				int choice = s.nextInt();
				switch (choice) {
				case 1: {
					System.out.println("Enter customerId: ");
					int customerId = s.nextInt();
					System.out.println("Enter customerName: ");
					String customerName = s.next();
					customerName += s.nextLine();

					System.out.println("Enter customerEmail: ");
					String customerEmail = s.nextLine();

					System.out.println("Enter customerPhone: ");
					long customerPhone = s.nextLong();

					CustomerDao customerDao = new CustomerDao();
					customerDao.addCustomer(customerId, customerName, customerEmail, customerPhone);
				}
					break;
				case 2: {
					CustomerDao customerDao = new CustomerDao();
					System.out.println("Enter customerId: ");
					int customerId = s.nextInt();
					customerDao.deleteCustomer(customerId);
				}
					break;
				case 3: {

					System.out.println("Enter customerId: ");
					int customerId = s.nextInt();
					System.out.println("Enter customerName: ");
					String customerName = s.next();
					customerName += s.nextLine();

					System.out.println("Enter customerEmail: ");
					String customerEmail = s.nextLine();

					System.out.println("Enter customerPhone: ");
					long customerPhone = s.nextLong();

					CustomerDao customerDao = new CustomerDao();
					customerDao.updateCustomer(customerId, customerName, customerEmail, customerPhone);
				}
					break;
				case 4: {
					System.out.println("Logout successfully!!!");
					System.exit(choice);
				}
					break;
				default: {
					System.out.println("invalid choice!!!");
				}

				}
			}
		} else {
			System.out.println("invalid credintial please try again!!!");
		}
	}
}
