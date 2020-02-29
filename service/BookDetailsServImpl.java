package com.capgemini.librarymanagementsystem.service;

import com.capgemini.librarymanagementsystem.bean.BookDetails;
import com.capgemini.librarymanagementsystem.dao.BookDetailsDao;
import com.capgemini.librarymanagementsystem.factory.LibraryManagementFactory;

public class BookDetailsServImpl implements BookDetailsServ {

	BookDetailsDao bdao = LibraryManagementFactory.objectBookDao();

	public void showAllBook() {
		
		bdao.showAllBook();
	}

	public boolean updateBook(int bookId, BookDetails books) {

		return bdao.updateBook(bookId, books);
	}

	public boolean deleteBook(int bookId) {

		return bdao.deleteBook(bookId);
	}

	public boolean addBook(BookDetails books) {

		return bdao.addBook(books);
	}

	public BookDetails searchBook(int bookId) {

		return bdao.searchBook(bookId);
	}

}
