package com.validation;

public class checking {
	
	public boolean validateUser(String name , String email ,String password) {
		return name.equalsIgnoreCase("pavan") && email.equalsIgnoreCase("pavan@123") &&  password.equalsIgnoreCase("hello");
	}

}
