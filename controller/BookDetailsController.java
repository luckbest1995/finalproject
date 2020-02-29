package com.capgemini.librarymanagementsystem.controller;

import java.util.Scanner;

import com.capgemini.librarymanagementsystem.bean.BookDetails;
import com.capgemini.librarymanagementsystem.bean.BooksTransaction;
import com.capgemini.librarymanagementsystem.db.BookDB;
import com.capgemini.librarymanagementsystem.db.TransactionDB;
import com.capgemini.librarymanagementsystem.factory.LibraryManagementFactory;
import com.capgemini.librarymanagementsystem.service.BookDetailsServ;
import com.capgemini.librarymanagementsystem.service.BookRegistrationServ;
import com.capgemini.librarymanagementsystem.service.BooksTransactionServ;
import com.capgemini.librarymanagementsystem.validation.LibraryValidation;

public class BookDetailsController {
  
	static Scanner sc = new Scanner(System.in);
	public static void bookMain() {
		BookDetailsServ userv = LibraryManagementFactory.objectBookServ();
		BooksTransactionServ breg1 = LibraryManagementFactory.objectBookTransactionServ();
		BookDB db = LibraryManagementFactory.objectBookDB();
		
		while (true) {
			System.out.println("Choose Any One");
			System.out.println("1. Add Book");
			System.out.println("2. Delete Book");
			System.out.println("3. Show All Available Books");
			System.out.println("4. Generate Book Fine");
			System.out.println("5. Admin Home");
			System.out.println("6. LogOut");

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
				BookDetails details = new BookDetails();
				System.out.println("Add New Book Details ");
				System.out.println("-------------------");
//				System.out.println("Enter book id");
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
//				details.setBookId(id);

				System.out.println("Enter Author 1");
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
				details.setAuthor1(na);
				
				System.out.println("Enter Author 2");
				String na1 = null;
				char n1 = 'y';
				while (n1 == 'y') {
					na1 = sc.next();

					if (LibraryValidation.isStringAlphabet(na1)) {
						n1 = 'n';
					} else {
						System.err.println("enter only alphabets");
					}
				}
				details.setAuthor2(na1);
				
				System.out.println("Enter Book Name");
				String na2 = null;
				char n2 = 'y';
				while (n2 == 'y') {
					na2 = sc.next();

					if (LibraryValidation.isStringAlphabet(na2)) {
						n2 = 'n';
					} else {
						System.err.println("enter only alphabets");
					}
				}
				details.setBookName(na2);

				System.out.println("Enter Publisher");
				String na3 = null;
				char n3 = 'y';
				while (n3 == 'y') {
					na3 = sc.next();

					if (LibraryValidation.isStringAlphabet(na3)) {
						n3 = 'n';
					} else {
						System.err.println("enter only alphabets");
					}
				}
				details.setPublisher(na3);
				
				System.out.println("Enter year of publication");
				String na4 = null;
				char n4 = 'y';
				while (n4 == 'y') {
					na4 = sc.next();

					if (LibraryValidation.dateValidation(na4)) {
						n4 = 'n';
					} else {
						System.err.println("enter only alphabets");
					}
				}
				details.setYop(na4);
				userv.addBook(details);
				break;

			case 2:
				System.out.println("Enter bookid to remove book details ");
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
				userv.deleteBook(id1);
				break;

			case 3:
				System.out.println("****************************************************************************");
				userv.showAllBook();
				db.book();
				System.out.println("****************************************************************************");
				break;

			case 4:
				BooksTransaction transBook = new BooksTransaction();
				System.out.println("Add Book Transaction ");
				System.out.println("-------------------");
				
				System.out.println("Enter Book Fine");
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
				transBook.setFine(rr1);
				
				System.out.println("Enter issue Date");
				String rb4 = null;
				char r4 = 'y';
				while (r4 == 'y') {
					rb4 = sc.next();

					if (LibraryValidation.dateValidation(rb4)) {
						r4 = 'n';
					} else {
						System.err.println("enter only alphabets");
					}
				}
				transBook.setIssueDate(rb4);
				
				System.out.println("Enter register id");
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
				transBook.setRegistrationId(rr2);

				
				System.out.println("Enter Return Date");
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
				transBook.setReturnDate(rb3);
				breg1.addTransaction(transBook);
				
				break;
				
			case 5:
				
				AdminController.adminMain();
				break;

			case 6:
				System.out.println("Successfully Logout");
				HomePage.main(null);


			default:
				System.out.println("Choose Correct One");
				break;
			}
		}
	}
	
	public static void returnBook() {
		BooksTransactionServ bserv = LibraryManagementFactory.objectBookTransactionServ();
		TransactionDB trans = LibraryManagementFactory.objectTransDB();
		while (true) {
		System.out.println("1. Enter Registration Id Which book you want to return...");
		System.out.println("2. Show All Fine");
		
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
			
			System.out.println("Enter Transaction id  ");
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
			bserv.deleteTransaction(id1);
			break;
			
		case 2:
			System.out.println("****************************************************************************");
			bserv.showAllTrans();
			trans.trans();
			
			System.out.println("****************************************************************************");
			break;
			
			default:
				System.out.println("Enter Only Corrrect Numbers");
				break;
		}
		}
		}
		
	}
	

