package com.login.info;

import model1.User1;

public class validation {

	
	public static boolean checking(String name , String email ,String password ) {
  User1 user1 = new User1();
		return name.equals(user1.name) && email.equals(user1.email) && password.equals(user1.password);	
}
}