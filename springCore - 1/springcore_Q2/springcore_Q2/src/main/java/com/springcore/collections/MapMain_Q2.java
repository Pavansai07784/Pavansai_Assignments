package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapMain_Q2 {

	public static void main(String[] args) {		
		ApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
		Map_Q2 quest=(Map_Q2) context.getBean("Mapname");
		System.out.println(quest);



	}

}
