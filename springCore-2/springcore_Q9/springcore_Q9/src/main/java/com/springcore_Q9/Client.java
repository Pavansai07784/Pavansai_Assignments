package com.springcore_Q9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore_Q9.HelloWorld;
public class Client {

	public static void main(String[] args) {		 
		        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("web.xml");
		        cap.close();
		    
	}

}
