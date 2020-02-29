package com.capgemini.librarymanagementsystem.service;

import com.capgemini.librarymanagementsystem.dao.LibrarianDao;
import com.capgemini.librarymanagementsystem.factory.LibraryManagementFactory;

public class LibrarianServImpl implements LibrarianServ {

	LibrarianDao ldao = LibraryManagementFactory.objectLibDao();

	public boolean login(String userName, String password) {

		return ldao.login(userName, password);
	}

}
