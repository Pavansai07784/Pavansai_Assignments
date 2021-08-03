package com.springcore_Q4.springcore_Q4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springcore_Q3.springcore_Q3.BankAccountRepositoryImpl;

@SpringBootTest
class SpringcoreQ4ApplicationTests {


	@Autowired
	BankAccountRepositoryImpl bankAccountRepositoryImpl;



	@Test
	void contextLoads() {
		
     assertEquals(70.00, bankAccountRepositoryImpl.getBalance(1) );

	
	}

}
