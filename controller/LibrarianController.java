package com.capgemini.librarymanagementsystem.controller;

import java.util.Scanner;

import com.capgemini.librarymanagementsystem.bean.LibrarianBean;
import com.capgemini.librarymanagementsystem.dao.LibrarianDao;
import com.capgemini.librarymanagementsystem.dao.LibrarianDaoImpl;
import com.capgemini.librarymanagementsystem.factory.LibraryManagementFactory;
import com.capgemini.librarymanagementsystem.service.LibrarianServ;

public class LibrarianController {

	static LibrarianServ ldao = LibraryManagementFactory.objectLibServ();

	public static void adminMain1() {

		LibrarianDao admin = new LibrarianDaoImpl();
		LibrarianBean ad = new LibrarianBean();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("                            :::WEl-COME::::");

			System.out.println("                            :::: LOGIN::::   ");
			System.out.println("Enter your userName: ");
			String uname = sc.next();
			System.out.println("Enter your password: ");
			String pswd = sc.next();
			boolean login = admin.login(uname, pswd);
			if (login == true) {
         
			System.out.println("Admin Login Successfully");
			} else {
				System.err.println("Invalid UserName or Password To Login..!");
				LibrarianController.adminMain1();
			}
			break;
		}
	}
}
