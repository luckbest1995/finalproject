package com.capgemini.librarymanagementsystem.exception;

public class BookException extends RuntimeException{

	String message;
	public BookException() {
		
	}
	public BookException(String message){
		super();
		this.message=message;
	}
	 @Override
	public String getMessage() {
		return message;
	}
}
