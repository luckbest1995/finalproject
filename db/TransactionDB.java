package com.capgemini.librarymanagementsystem.db;

import java.util.HashMap;

import com.capgemini.librarymanagementsystem.bean.BooksTransaction;

public class TransactionDB {

	public static HashMap<Integer, BooksTransaction> tranData = new HashMap<Integer, BooksTransaction>();

	public void trans() {
		BooksTransaction btran = new BooksTransaction();
		
		btran.setTransactionId(301);
		btran.setFine(200);
		btran.setIssueDate("25/02/2020");
		btran.setRegistrationId(12);
		btran.setReturnDate("01/03/2021");
		System.out.println(btran);
		
		btran.setTransactionId(302);
		btran.setFine(300);
		btran.setIssueDate("24/02/2020");
		btran.setRegistrationId(13);
		btran.setReturnDate("01/03/2020");
		System.out.println(btran);
		
		btran.setTransactionId(303);
		btran.setFine(400);
		btran.setIssueDate("21/02/2020");
		btran.setRegistrationId(14);
		btran.setReturnDate("11/03/2020");
		System.out.println(btran);
		
		btran.setTransactionId(304);
		btran.setFine(600);
		btran.setIssueDate("21/01/2020");
		btran.setRegistrationId(15);
		btran.setReturnDate("02/04/2020");
		System.out.println(btran);
		
		btran.setTransactionId(305);
		btran.setFine(500);
		btran.setIssueDate("14/02/2020");
		btran.setRegistrationId(16);
		btran.setReturnDate("01/15/2020");
		System.out.println(btran);
	}

}
