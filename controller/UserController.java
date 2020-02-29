package com.capgemini.librarymanagementsystem.controller;

import java.util.Scanner;

import com.capgemini.librarymanagementsystem.bean.UserBean;
import com.capgemini.librarymanagementsystem.dao.LibrarianDao;
import com.capgemini.librarymanagementsystem.dao.LibrarianDaoImpl;
import com.capgemini.librarymanagementsystem.db.BookDB;
import com.capgemini.librarymanagementsystem.db.UserDB;
import com.capgemini.librarymanagementsystem.factory.LibraryManagementFactory;
import com.capgemini.librarymanagementsystem.service.UserServ;
import com.capgemini.librarymanagementsystem.validation.LibraryValidation;

public class UserController {
	static UserServ userv = LibraryManagementFactory.objectUserServ();
	static Scanner sc = new Scanner(System.in);
    static UserDB db = LibraryManagementFactory.objectUserDB();
	
	public static void userMain() {
		LibrarianDao admin = new LibrarianDaoImpl();
		UserBean ad = new UserBean();

		while (true) {
			System.out.println("                            :::WElCOME USER::::");

			System.out.println("                            :::: USER LOGIN::::   ");
			System.out.println("Enter your userName: ");
			String uname = sc.next();
			System.out.println("Enter your password: ");
			String pswd = sc.next();
			boolean login = admin.login(uname, pswd);
			if (login == true) {
				System.out.println("User Successfully Login");

			} else {
				System.err.println("Invalid UserName or Password To Login..!");
				HomePage.main(null);
			}
			break;
		}
	}

	public static void main1() {

		UserServ user = LibraryManagementFactory.objectUserServ();
		while (true) {
			System.out.println("Choose Any One");
			System.out.println("1. Add User");
			System.out.println("2. Delete User");
			System.out.println("3. Show All User");
			System.out.println("4. Admin Home");

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
			Integer choice = Integer.parseInt(ch);

			switch (choice) {
			case 1:
				UserBean details = new UserBean();
				System.out.println("Add Details of User ");
				System.out.println("-------------------");
//				System.out.println("Enter user id");
//				String ch2 = null;
//				char c2 = 'y';
//				while (c2 == 'y') {
//					ch2 = sc.next();
//					if (LibraryValidation.isNumber(ch2)) {
//						c2 = 'n';
//					} else {
//						System.err.println("enter numbers only");
//					}
//				}
//				Integer id = Integer.parseInt(ch2);
//				details.setUserId(id);

				System.out.println("Enter User name");
				String na = null;
				char n = 'y';
				while (n == 'y') {
					na = sc.next();

					if (LibraryValidation.isStringAlphabet(na)) {
						n = 'n';
					} else {
						System.err.println("enter only alphabets");
					}
				}
				details.setUserName(na);

				System.out.println("Enter your email address");
				String em = null;
				char ce = 'y';
				while (ce == 'y') {
					em = sc.next();
					if (LibraryValidation.isEmail(em)) {
						ce = 'n';
					} else {
						System.err.println("enter valid email");
					}
				}
				details.setEmail(em);

				System.out.println("Enter Password");
				String pa = null;
				char p = 'y';
				while (p == 'y') {
					pa = sc.next();

					if (LibraryValidation.isStringAlphabet(pa)) {
						p = 'n';
					} else {
						System.err.println("enter only alphabets");
					}
				}
				details.setPassword(pa);
			   
				userv.addUser(details);
				break;

			case 2:
				System.out.println("Enter userid to remove customer details ");
				String ch5 = null;
				char c5 = 'y';
				while (c5 == 'y') {
					ch5 = sc.next();
					if (LibraryValidation.isNumber(ch5)) {
						c5 = 'n';
					} else {
						System.err.println("enter numbers only");
					}
				}
				Integer id1 = Integer.parseInt(ch5);
				userv.deleteUser(id1);
				break;

			case 3:
				
				System.out.println("****************************************************************************");
				userv.showAllUser();
				db.user();
				System.out.println("****************************************************************************");
				break;

			case 4:
				AdminController.adminMain();
				break;

			default:
				System.out.println("Choose Correct One");
				break;
			}
		}
	}
}
