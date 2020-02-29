package com.capgemini.librarymanagementsystem.dao;

import java.util.HashMap;
import java.util.Set;

import com.capgemini.librarymanagementsystem.bean.BookDetails;
import com.capgemini.librarymanagementsystem.bean.BooksRegistration;
import com.capgemini.librarymanagementsystem.bean.BooksTransaction;
import com.capgemini.librarymanagementsystem.controller.BookDetailsController;
import com.capgemini.librarymanagementsystem.exception.BookException;

public class BooksTransactionDaoImpl implements BooksTransactionDao {

	private static HashMap<Integer, BooksTransaction> h1 = new HashMap<Integer, BooksTransaction>();
	static int transactionId = 0;

	public void showAllTrans() {
		if(h1.isEmpty()==false) {
			System.out.println("                            ::::ALL USER DETAILS::::");
			Set<Integer> s=h1.keySet();
			for (Integer key : s) {
				BooksTransaction cb=h1.get(key);
				System.out.println(cb);
			}
		}else {
			System.err.println("Currently there is no user..");
		}
	}

	public boolean updateTransaction(int transactionId, BooksTransaction books) {
		if (h1.replace(transactionId, books) != null) {
			return true;
		} else {
			throw new BookException(" This book transaction Not Found, Problem in updating try again..!");
		}
	}

	public boolean deleteTransaction(int transactionId) {
		try {
		if (h1.remove(transactionId) != null) {
			return true;
		} else {
			return false;
			
		}
		}catch(Exception e) {
			BookDetailsController.returnBook();
			throw new BookException("This Book transaction Not Found..!");
		}
	}

	public boolean addTransaction(BooksTransaction books) {
		while (true) {
			++transactionId;

			books.setRegistrationId(transactionId);
			try {
				h1.put(transactionId, books);
				return true;
			} catch (Exception e) {
				throw new BookException("Duplicate transaction ID, please try again..!");
			}
		}
	}

	public BooksTransaction searchTransaction(int transactionId) {
		if (h1.containsKey(transactionId) == true) {
			return h1.get(transactionId);
		} else {
			System.err.println("No such transaction Exist..!");
			return null;
		}
	}

}
