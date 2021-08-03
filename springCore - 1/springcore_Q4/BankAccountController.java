package com.springcore_Q4.springcore_Q4;

import org.springframework.stereotype.Component;

@Component
public class BankAccountController {
	public double withdraw(long accountId ,double balance) {
		return 0;
	}
	public double deposit(long accountId ,double balance) {
		return 0;
	}
	public double getBalanace(long accountId) {
		return 0;
	}
	public boolean fundTransfer(long fromAccount , long toAccount ,double amount) {
		return false;
	}	
}
