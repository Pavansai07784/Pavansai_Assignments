package com.springcore_Q4.springcore_Q4;

public interface BankAccountRepository {
	
	public double getBalance(int accountId);

	public double updateBalance(int accountId ,double accountBalance);	
}
