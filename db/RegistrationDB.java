package com.capgemini.librarymanagementsystem.db;

import java.util.HashMap;

import com.capgemini.librarymanagementsystem.bean.BooksRegistration;
import com.capgemini.librarymanagementsystem.bean.BooksTransaction;

public class RegistrationDB {

	public static HashMap<Integer, BooksRegistration> regData = new HashMap<Integer, BooksRegistration>();
	public void trans() {
		BooksRegistration btran = new BooksRegistration();
		
		btran.setRegistrationId(401);
		btran.setUserId(201);
		btran.setBookId(101);
        btran.setRegistrationDate("11/03/2016");
		System.out.println(btran);
		
		btran.setRegistrationId(402);
		btran.setUserId(202);
		btran.setBookId(102);
        btran.setRegistrationDate("01/05/2016");
		System.out.println(btran);
		
		btran.setRegistrationId(403);
		btran.setUserId(303);
		btran.setBookId(103);
        btran.setRegistrationDate("07/07/2017");
		System.out.println(btran);
		
		btran.setRegistrationId(404);
		btran.setUserId(304);
		btran.setBookId(104);
        btran.setRegistrationDate("09/11/2019");
		System.out.println(btran);
		
		btran.setRegistrationId(407);
		btran.setUserId(307);
		btran.setBookId(107);;
        btran.setRegistrationDate("01/09/2018");
		System.out.println(btran);
	}

	
}
