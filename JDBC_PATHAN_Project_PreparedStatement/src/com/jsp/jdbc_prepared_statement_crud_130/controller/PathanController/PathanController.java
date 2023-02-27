package com.jsp.jdbc_prepared_statement_crud_130.controller.PathanController;
import com.jsp.jdbc_prepared_statement_crud_130.dto.PathanReview.*;

import com.jsp.jdbc_prepared_statement_crud_130.service.PathanReviewService.*;
import java.util.*;
import java.util.Set;

import com.jsp.jdbc_prepared_statement_crud_130.dao.PathanDao.*;

public class PathanController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		PathanReviewService pathanReviewService = new PathanReviewService();

		PathanReview pathanReview = null ;

		while (true) {
			System.out.println("1.Insert\n2.Update\n3.Delete\n4.Display\n5.Exit");
			System.out.println("Enter your choice");
			int ch = scanner.nextInt();

			switch (ch) {

			case 1: {

				pathanReview = new PathanReview();

				System.out.println("Enter the Id");
				int id = scanner.nextInt();

				System.out.println("Enter the MovieRating");
				String rating = scanner.next();

				System.out.println("Enter the movie price");
				double price = scanner.nextDouble();

				System.out.println("Enter the movieName");
				String name = scanner.next();

				pathanReview.setPathanId(id);

				pathanReview.setPathanName(name);
				pathanReview.setPathanRating(rating);
				pathanReview.setPathanPrice(price);

				pathanReviewService.savePathanReview(pathanReview);

			}
				break;
			case 2: {
				System.out.println("Enter the Id");
				int id = scanner.nextInt();

				System.out.println("Enter the MovieRating");
				String rating = scanner.next();

				System.out.println("Enter the movie price");
				double price = scanner.nextDouble();
				
				pathanReviewService.updatePathan(id, rating, price);
			}
				break;
			case 3: {

			}
				break;
			case 4: {
				Set<PathanReview> pathanReviews=pathanReviewService.displayAllReview();
				
				for (PathanReview pathanReview2 : pathanReviews) {
					
					System.out.println("PathanReviewId = "+pathanReview2.getPathanId());
					System.out.println("PathanReviewName = "+pathanReview2.getPathanName());
					System.out.println("PathanReviewRating = "+pathanReview2.getPathanRating());
					System.out.println("PathanReviewPrice = "+pathanReview2.getPathanPrice());
					
				}
			}
				break;
			case 5: {
				System.exit(0);
			}
				break;
			}
		}

	}

}







































































































































