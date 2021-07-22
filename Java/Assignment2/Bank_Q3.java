package assignment2;

import java.util.Scanner;

public class Bank_Q3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int BankBalance = 5000;
		int FixedDeposits = 2350;
		int CashCredit  = 1500;
		System.out.println("Enter the Account type Savings (or) Current");
		String AccountType = sc.nextLine();
		if(  AccountType.equalsIgnoreCase("savings")  ) {
			System.out.println(total(BankBalance,FixedDeposits));		
		}else if(  AccountType.equalsIgnoreCase("current") ) {
			System.out.println(total(BankBalance ,CashCredit));	
		}
	}
	public static int total(int BankBalance ,int Amount ){
		System.out.println("The amount available is");
		return BankBalance+Amount;
	}


}
