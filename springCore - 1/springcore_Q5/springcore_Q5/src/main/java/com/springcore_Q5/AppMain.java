package com.springcore_Q5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore_Q5.Employee;

public class AppMain {
	
@SuppressWarnings("resource")	
public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("web.xml");
	 
    Employee emp = ac.getBean("myemployee", Employee.class);
    System.out.println(emp.toString());
}
}
