package com.springcore_Q4.springcore_Q4;

public interface BankAccountService {

	public double withdraw(int accountId ,double balance) ;
	public double deposit(int accountId ,double balance) ;
	public double getBalanace(int accountId);
	public boolean fundTransfer(int fromAccount , int toAccount ,double amount);
	
	
	
}
