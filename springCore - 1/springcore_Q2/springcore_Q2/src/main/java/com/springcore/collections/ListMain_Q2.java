package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListMain_Q2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
		List_Q2 quest=(List_Q2) context.getBean("Listname");
		System.out.println(quest);

	}

}
