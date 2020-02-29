package com.capgemini.librarymanagementsystem.controller;

import java.util.Scanner;

import com.capgemini.librarymanagementsystem.validation.LibraryValidation;

public class HomePage {

	public static void main(String[] args) {

		System.out.println("**********************************************");
		System.out.println("***  Welcome To Our Library Management     ***");
		System.out.println("***              System                    ***");
		System.out.println("**********************************************");

		System.out.println("choose your option");
		System.out.println("==================");
		System.out.println("1. Admin Login(Librarian)");
		System.out.println("2. User Login(Student)");
		System.out.println("3. About");

		Scanner scanner = new Scanner(System.in);
		String i = scanner.next();
		if(LibraryValidation.isNumber(i)) {
			Integer i1 = Integer.parseInt(i);
			switch (i1) {
			case 1:
				LibrarianController.adminMain1();
				break;

			case 2:
				UserController.userMain();
				break;
           
			case 3:
				About.about();
				break;
				
			default:
				System.out.println("please enter valid option");
			}
		}else {
			System.err.println("Enter only numbers");
			HomePage.main(args);
		}
	}

}


