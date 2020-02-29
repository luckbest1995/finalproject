package com.capgemini.librarymanagementsystem.dao;

import java.util.HashMap;

import com.capgemini.librarymanagementsystem.bean.BooksTransaction;

public interface BooksTransactionDao {

	public void showAllTrans();

	public boolean updateTransaction(int transactionId, BooksTransaction books);

	public boolean deleteTransaction(int transactionId);

	public boolean addTransaction(BooksTransaction books);

	public BooksTransaction searchTransaction(int transactionId);
}
