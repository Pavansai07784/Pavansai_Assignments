package com.springcore_Q4.springcore_Q4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringcoreQ4Application {

	public static void main(String[] args) {
   
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		BankAccountServiceImpl BankAccountServiceImpl = context.getBean("BankAccountServiceImpl",BankAccountServiceImpl.class);
	
		
		System.out.println(  BankAccountServiceImpl.fundTransfer(1,2,10.00));
		
		
		
		
		
	}

}
