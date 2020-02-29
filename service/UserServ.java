package com.capgemini.librarymanagementsystem.service;


import com.capgemini.librarymanagementsystem.bean.UserBean;

public interface UserServ {

	public void showAllUser();

	public boolean updateUser(int userId, UserBean password);

	public boolean deleteUser(int userId);

	public boolean addUser(UserBean books);

	public UserBean searchUser(int userId);
}
