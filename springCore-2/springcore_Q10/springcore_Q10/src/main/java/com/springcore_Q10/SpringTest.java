package com.springcore_Q10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("web.xml");
		ApplicationContextAwareTest appcontext= (ApplicationContextAwareTest)context.getBean("appcontext");
		ApplicationContext appCon =appcontext.getContext();
		A a= (A)appCon.getBean("testA");
		a.doTask();
		context.registerShutdownHook();
	}

}
