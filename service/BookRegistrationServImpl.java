package com.capgemini.librarymanagementsystem.service;

import java.util.HashMap;

import com.capgemini.librarymanagementsystem.bean.BooksRegistration;
import com.capgemini.librarymanagementsystem.dao.BooksRegistrationDao;
import com.capgemini.librarymanagementsystem.factory.LibraryManagementFactory;

public class BookRegistrationServImpl implements BookRegistrationServ {

	BooksRegistrationDao brdao = LibraryManagementFactory.objectBookRegisterDao();

	public HashMap<Integer, BooksRegistration> getAllInfo() {

		return brdao.getAllInfo();
	}

	public boolean updateRegistration(int registrationId, BooksRegistration books) {

		return brdao.updateRegistration(registrationId, books);
	}

	public boolean deleteRegistration(int registrationId) {

		return brdao.deleteRegistration(registrationId);
	}

	public boolean addRegistration(BooksRegistration books) {

		return brdao.addRegistration(books);
	}

	public BooksRegistration searchRegistration(int registrationId) {

		return brdao.searchRegistration(registrationId);
	}

}
