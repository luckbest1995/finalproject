package com.capgemini.librarymanagementsystem.controller;

import java.util.Scanner;

import com.capgemini.librarymanagementsystem.validation.LibraryValidation;

public class AdminController {

	public static void adminMain() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println("                                :::: ADMIN ::::" );
			System.out.println("Enter Options To Move Forward");
			System.out.println("1. User Operation ");
			System.out.println("2. Book Operations");
			System.out.println("3.logout");

			String ch = null;
			char c = 'y';
			while (c == 'y') {
				ch = sc.next();
				if (LibraryValidation.isNumber(ch)) {
					c = 'n';
				} else {
					System.err.println("enter numbers only");
				}
			}
			Integer options = Integer.parseInt(ch);
			switch (options) {
			case 1:
				UserController.main1();
				break;

			case 2:
				BookDetailsController.bookMain();
				break;

			
			case 3:
				HomePage.main(null);
				break;

			default:
				System.err.println("Enter the correct value...!");
				break;
			}
		}
	}
}
