package com.capgemini.librarymanagementsystem.service;


import com.capgemini.librarymanagementsystem.bean.BookDetails;

public interface BookDetailsServ {

	public void showAllBook();

	public boolean updateBook(int bookId, BookDetails books);

	public boolean deleteBook(int bookId);

	public boolean addBook(BookDetails books);

	public BookDetails searchBook(int bookId);
}
