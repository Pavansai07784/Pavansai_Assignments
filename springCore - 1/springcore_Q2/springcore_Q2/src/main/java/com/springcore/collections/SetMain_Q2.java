package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetMain_Q2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
		Set_Q2 quest=(Set_Q2) context.getBean("Setname");
		System.out.println(quest);
	}

}
