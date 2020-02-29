package com.capgemini.librarymanagementsystem.service;

import java.util.HashMap;

import com.capgemini.librarymanagementsystem.bean.BooksRegistration;

public interface BookRegistrationServ {

	public HashMap<Integer, BooksRegistration> getAllInfo();

	public boolean updateRegistration(int registrationId, BooksRegistration books);

	public boolean deleteRegistration(int registrationId);

	public boolean addRegistration(BooksRegistration books);

	public BooksRegistration searchRegistration(int registrationId);
}
