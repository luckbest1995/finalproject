package com.capgemini.librarymanagementsystem.factory;

import com.capgemini.librarymanagementsystem.dao.BookDetailsDao;
import com.capgemini.librarymanagementsystem.dao.BookDetailsDaoImpl;
import com.capgemini.librarymanagementsystem.dao.BooksRegistrationDao;
import com.capgemini.librarymanagementsystem.dao.BooksRegistrationDaoImpl;
import com.capgemini.librarymanagementsystem.dao.BooksTransactionDao;
import com.capgemini.librarymanagementsystem.dao.BooksTransactionDaoImpl;
import com.capgemini.librarymanagementsystem.dao.LibrarianDao;
import com.capgemini.librarymanagementsystem.dao.LibrarianDaoImpl;
import com.capgemini.librarymanagementsystem.dao.UserDao;
import com.capgemini.librarymanagementsystem.dao.UserDaoImpl;
import com.capgemini.librarymanagementsystem.db.BookDB;
import com.capgemini.librarymanagementsystem.db.RegistrationDB;
import com.capgemini.librarymanagementsystem.db.TransactionDB;
import com.capgemini.librarymanagementsystem.db.UserDB;
import com.capgemini.librarymanagementsystem.service.BookDetailsServ;
import com.capgemini.librarymanagementsystem.service.BookDetailsServImpl;
import com.capgemini.librarymanagementsystem.service.BookRegistrationServ;
import com.capgemini.librarymanagementsystem.service.BookRegistrationServImpl;
import com.capgemini.librarymanagementsystem.service.BooksTransactionServ;
import com.capgemini.librarymanagementsystem.service.BooksTransactionServImpl;
import com.capgemini.librarymanagementsystem.service.LibrarianServ;
import com.capgemini.librarymanagementsystem.service.LibrarianServImpl;
import com.capgemini.librarymanagementsystem.service.UserServ;
import com.capgemini.librarymanagementsystem.service.UserServImpl;

public class LibraryManagementFactory {

	public LibraryManagementFactory() {

	}

	public static LibrarianDao objectLibDao() {
		LibrarianDao ldao = new LibrarianDaoImpl();
		return ldao;
	}
	
	public static LibrarianServ objectLibServ() {
		LibrarianServ lserv = new LibrarianServImpl();
		return lserv;
	}
	
	public static UserDao objectUserDao() {
		UserDao user = new UserDaoImpl();
		return user;
	}
	
	public static UserServ objectUserServ() {
		UserServ serv = new UserServImpl();
		return serv;
	}
	
	public static BookDetailsDao objectBookDao() {
		BookDetailsDao dao = new BookDetailsDaoImpl();
		return dao;
	}
	
	public static BookDetailsServ objectBookServ() {
		BookDetailsServ serv = new BookDetailsServImpl();
		return serv;
	}
	
	public static BooksRegistrationDao objectBookRegisterDao() {
		BooksRegistrationDao brev = new BooksRegistrationDaoImpl();
		return brev;
	}
	
	public static BookRegistrationServ objectBookRegisterServ() {
		BookRegistrationServ bserv = new BookRegistrationServImpl();
		return bserv;
	}
	
	public static BooksTransactionDao objectBookTransactionDao() {
		BooksTransactionDao bt = new BooksTransactionDaoImpl();
		return bt;
	}
	
	public static BooksTransactionServ objectBookTransactionServ() {
		BooksTransactionServ btran = new BooksTransactionServImpl();
		return btran;
	}
	
	public static BookDB objectBookDB() {
		BookDB db = new BookDB();
		return db;
	}
	
	public static UserDB objectUserDB() {
		UserDB udb = new UserDB();
		return udb;
	}
	
	public static TransactionDB objectTransDB() {
		TransactionDB tdb = new TransactionDB();
		return tdb;
	}
	
	public static RegistrationDB objectRegisterDB() {
		RegistrationDB rdb = new RegistrationDB();
		return rdb;
	}
}
