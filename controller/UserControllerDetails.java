package com.capgemini.librarymanagementsystem.controller;

import java.util.Scanner;

import com.capgemini.librarymanagementsystem.bean.BookDetails;
import com.capgemini.librarymanagementsystem.bean.BooksRegistration;
import com.capgemini.librarymanagementsystem.bean.UserBean;
import com.capgemini.librarymanagementsystem.db.BookDB;
import com.capgemini.librarymanagementsystem.factory.LibraryManagementFactory;
import com.capgemini.librarymanagementsystem.service.BookDetailsServ;
import com.capgemini.librarymanagementsystem.service.BookRegistrationServ;
import com.capgemini.librarymanagementsystem.service.BooksTransactionServ;
import com.capgemini.librarymanagementsystem.service.UserServ;
import com.capgemini.librarymanagementsystem.validation.LibraryValidation;

public class UserControllerDetails {

	 
	public static void userMain1() {
		Scanner sc = new Scanner(System.in);
		UserServ bean = LibraryManagementFactory.objectUserServ();
		BookDetailsServ userv = LibraryManagementFactory.objectBookServ();
		BookRegistrationServ breg = LibraryManagementFactory.objectBookRegisterServ();
		BooksTransactionServ serv = LibraryManagementFactory.objectBookTransactionServ();
		BookDB db = LibraryManagementFactory.objectBookDB();
		
		
		while (true) {
			System.out.println("               :::: USER ::::");
			System.out.println("Choose Any One");
			System.out.println("1. Show all Book");
			System.out.println("2. Search Book");
			System.out.println("3. Borrow Book");
			System.out.println("4. Return Book");
			System.out.println("5. Change Password");
			System.out.println("6. Admin Home");
			System.out.println("7. LogOut");

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
				System.out.println("****************************************************************************");
				userv.showAllBook();
			    db.book();
				System.out.println("****************************************************************************");
				break;
				
			case 2:
				System.out.println("Enter Book id to show details");
				String bo=null;
				char b ='y';
				while(b=='y') {
					System.out.println("Enter Book id");
					bo= sc.next();
					if(LibraryValidation.isNumber(bo)) {
						b='n';
					} else {
						System.err.println("enter only numbers");
					}
				} 
				Integer search=Integer.parseInt(bo);
				BookDetails bean1 = userv.searchBook(search);
				if(bean1!=null) {
					System.out.println(bean1);
				} else {
					System.out.println("Book details not found");
				}
				break;
				
			case 3:
				BooksRegistration registerBook = new BooksRegistration();
				System.out.println("Add Book Registraction ");
				System.out.println("-------------------");
				
				System.out.println("Enter Book id");
				String rb1 = null;
				char r1 = 'y';
				while (r1 == 'y') {
					rb1 = sc.next();
					if (LibraryValidation.isNumber(rb1)) {
						r1 = 'n';
					} else {
						System.err.println("enter numbers only");
					}
				}
				Integer rr1 = Integer.parseInt(rb1);
				registerBook.setBookId(rr1);
				
				System.out.println("Enter User id");
				String rb2 = null;
				char r2 = 'y';
				while (r2 == 'y') {
					rb2 = sc.next();
					if (LibraryValidation.isNumber(rb2)) {
						r2 = 'n';
					} else {
						System.err.println("enter numbers only");
					}
				}
				Integer rr2 = Integer.parseInt(rb2);
				registerBook.setUserId(rr2);

				
				System.out.println("Enter Registraction Date");
				String rb3 = null;
				char r3 = 'y';
				while (r3 == 'y') {
					rb3 = sc.next();

					if (LibraryValidation.dateValidation(rb3)) {
						r3 = 'n';
					} else {
						System.err.println("enter only alphabets");
					}
				}
				registerBook.setRegistrationDate(rb3);
				breg.addRegistration(registerBook);
				break;
				
			case 4:
				BookDetailsController.returnBook();
				break;
				
			case 5:
				System.out.println("Enter User id to modify Password");
				String id2=null;
				char c3='y';
				while(c3=='y') {
					id2= sc.next();
					if(LibraryValidation.isNumber(id2)) {
						c3='n';
					} else {
						System.err.println("enter only numbers");
					}
				} 
				Integer Id2= Integer.parseInt(id2);
				UserBean prod= bean.searchUser(Id2);
				if(prod!=null) {
					System.out.println("Enter Password to update");
					String passuser=null;
					char q1='y';
					while(q1=='y') {
						passuser= sc.next();
						if(LibraryValidation.isStringAlphabet(passuser)) {
							q1='n';
						} else {
							System.err.println("Enter Password in String Only");
						}
					} 
					prod.setPassword(passuser);
					bean.updateUser(0, prod);

				} else {
					System.out.println("product id not found");
				}
				break;
				
            case 6:
				AdminController.adminMain();
				break;

			case 7:
				System.out.println("Successfully Logout");
				HomePage.main(null);


			default:
				System.out.println("Choose Correct One");
				break;
				
			}
	}
}
}
