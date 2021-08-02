package com.springcore_Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("web.xml");
		Customer customer=(Customer) context.getBean("customer1");
		
		System.out.println(customer);
	}

}
