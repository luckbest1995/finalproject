package com.capgemini.librarymanagementsystem.db;

import java.util.HashMap;

import com.capgemini.librarymanagementsystem.bean.BookDetails;
import com.capgemini.librarymanagementsystem.bean.BooksRegistration;
import com.capgemini.librarymanagementsystem.bean.LibrarianBean;


public class BookDB {

	public static HashMap<Integer, LibrarianBean> libData = new HashMap<Integer, LibrarianBean>();
	public static HashMap<Integer, BookDetails> detailsData = new HashMap<Integer, BookDetails>();
	
	public void book() {
		
		BookDetails book = new BookDetails();
		book.setBookId(201);
		book.setBookName("Math");
		book.setAuthor1("RD sharma");
		book.setAuthor2("RD raman");
		book.setPublisher("R Enterprises");
		book.setYop("1996");
		System.out.println(book);
	//	userData.put(11, user);

		book.setBookId(202);
		book.setBookName("English");
		book.setAuthor1("amit garg");
		book.setAuthor2("sumit garg");
		book.setPublisher("sun india publication");
		book.setYop("2012");
		System.out.println(book);
		
		book.setBookId(203);
		book.setBookName("Chemistery");
		book.setAuthor1("Lalith kumar");
		book.setAuthor2("Lila Kumar");
		book.setPublisher("Thakur publication");
		book.setYop("2015");
		System.out.println(book);
		
		book.setBookId(205);
		book.setBookName("Math");
		book.setAuthor1("");
		book.setAuthor2("himansi@gmail.com");
		book.setPublisher("himansi");
		book.setYop("2019");
		System.out.println(book);
		
		book.setBookId(204);
		book.setBookName("CBOT");
		book.setAuthor1("Gunjan Verma");
		book.setAuthor2("Rahul Verma");
		book.setPublisher("thakur Publication");
		book.setYop("2014");
		System.out.println(book);
	}
}
