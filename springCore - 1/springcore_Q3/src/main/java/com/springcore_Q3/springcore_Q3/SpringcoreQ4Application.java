package com.springcore_Q3.springcore_Q3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringcoreQ4Application {

	public static void main(String[] args) {
   
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		BankAccountRepositoryImpl BankAccountRepositoryImpl = context.getBean("BankAccountRepositoryImpl",BankAccountRepositoryImpl.class);
	
		
		System.out.println(  BankAccountRepositoryImpl.getBalance(1));
		
		
		
		
		
	}

}
