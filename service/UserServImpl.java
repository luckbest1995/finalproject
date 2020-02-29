package com.capgemini.librarymanagementsystem.service;

import com.capgemini.librarymanagementsystem.bean.UserBean;
import com.capgemini.librarymanagementsystem.dao.UserDao;
import com.capgemini.librarymanagementsystem.factory.LibraryManagementFactory;

public class UserServImpl implements UserServ{
	
	UserDao user = LibraryManagementFactory.objectUserDao();

	public void showAllUser() {
	
		user.showAllUser();
	}

	public boolean updateUser(int userId, UserBean password) {
	      System.out.println("Passsword Update Successfully");
		return user.updateUser(userId, password);
	}

	public boolean deleteUser(int userId) {
	
		return user.deleteUser(userId);
	}

	public boolean addUser(UserBean books) {
		System.out.println("Successfully Added User Details");
		return user.addUser(books);
	}

	public UserBean searchUser(int userId) {
		
		return user.searchUser(userId);
	}

	
}
