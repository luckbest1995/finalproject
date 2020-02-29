package com.capgemini.librarymanagementsystem.db;

import java.util.HashMap;

import com.capgemini.librarymanagementsystem.bean.UserBean;

public class UserDB {

	public static HashMap<Integer, UserBean> userData = new HashMap<Integer, UserBean>();
	public void user() {

		UserBean user = new UserBean();
		user.setUserId(101);
		user.setUserName("Himansi");
		user.setPassword("himansi");
		user.setEmail("himansi@gmail.com");
		System.out.println(user);
	//	userData.put(11, user);

		user.setUserId(102);
		user.setUserName("Himanshu");
		user.setPassword("himanshu");
		user.setEmail("himansi@gmail.com");
		System.out.println(user);
	//	userData.put(12, user);

		user.setUserId(103);
		user.setUserName("bhagya");
		user.setPassword("bhagya");
		user.setEmail("bhagya@gmail.com");
		System.out.println(user);
	//	userData.put(13, user);

		user.setUserId(104);
		user.setUserName("Azra");
		user.setPassword("Azra");
		user.setEmail("Azra@gmail.com");
		System.out.println(user);
	//	userData.put(14, user);
		
		user.setUserId(105);
		user.setUserName("Chaitra");
		user.setPassword("Chaitra");
		user.setEmail("Chaitra@gmail.com");
		System.out.println(user);

	}
}
