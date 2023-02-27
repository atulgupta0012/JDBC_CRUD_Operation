package com.jsp_Customer_Management_Project_Controller;

import java.util.Scanner;

import com.jsp_Customer_Management_Project.Admin;
import com.jsp_Customer_Management_Project_Service.AdminService;

public class AdminController {

	public static void main(String[] args) {
		System.out.println("welcome to Owner Window");
		while (true) {

			System.out.println(
					"1.InsertAdmin\n2.Update Admin with name and email\n3.Delete Admin\n4.Login Admin with name and email\n5.Exit");
			System.out.print("Enter your choice: ");
			Scanner s = new Scanner(System.in);
			int choice = s.nextInt();
			switch (choice) {
			case 1: {
				Admin admin = new Admin();
				System.out.print("Enter Admin id: ");
				int adminId = s.nextInt();
				admin.setAdminId(adminId);
				System.out.print("Enter Admin Name (Not more than 8 characters including space): ");
				String adminName = s.next();
				adminName += s.nextLine();
				admin.setAdminName(adminName);
				System.out.print("Enter Admin Email: ");
				String adminEmail = s.next();
				adminEmail += s.nextLine();
				admin.setAdminEmail(adminEmail);
				// creating reference for service method to stablish the connection.
				AdminService adminService = new AdminService();
				adminService.insertAdmin(admin);
				// creating reference for service method to stablish the connection.
			}
				break;
			case 2: {
				System.out.print("Enter adminId: ");
				int adminId = s.nextInt();
				System.out.print("Enter admin name: ");
				String adminName = s.next();
				adminName += s.nextLine();
				System.out.print("Enter admin email: ");
				String adminEmail = s.nextLine();
				// creating reference for service method to stablish the connection.
				AdminService adminService = new AdminService();
				adminService.updateAdmin(adminId, adminName, adminEmail);

			}
				break;
			case 3: {
				System.out.print("Enter adminId: ");
				int adminId = s.nextInt();
				AdminService adminService = new AdminService();
				adminService.deleteAdmin(adminId);
			}
				break;
			case 4: {
				System.out.print("Enter adminName: ");
				String adminName = s.next();
				adminName += s.nextLine();
				System.out.print("Enter adminEmail: ");
				String adminEmail = s.nextLine();
				AdminService adminService = new AdminService();
				adminService.loginAdmin(adminName, adminEmail);
			}
				break;

			case 5: {
				System.out.println("System.............closed");
				System.exit(choice);
			}
				break;

			default: {
				System.out.println("invalid choice");

			}

			}
		}
	}
}
