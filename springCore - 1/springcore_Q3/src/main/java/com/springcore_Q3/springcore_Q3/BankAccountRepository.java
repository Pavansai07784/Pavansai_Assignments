package com.springcore_Q3.springcore_Q3;

public interface BankAccountRepository {
	
	public double getBalance(int accountId);

	public double updateBalance(int accountId ,double accountBalance);	
}
