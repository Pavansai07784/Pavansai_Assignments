package com.springcore_Q3.springcore_Q3;

public interface BankAccountService {

	public double withdraw(int accountId ,double balance) ;
	public double deposit(int accountId ,double balance) ;
	public double getBalanace(int accountId);
	public boolean fundTransfer(int fromAccount , int toAccount ,double amount);
	
	
	
}
