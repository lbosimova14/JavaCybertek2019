package Lesson18_Encapsulation;

public class Bank {

	private String accountHolder;
	private int accountNumber;
	private double balance;
	private int PinNumber;
	
	//setter for store data
	public void setAccountHolder(String accountName) {
		String pattern="^[a-zA-Z0-9]*$";//string contains only letters and numbers without any symbols
		if(accountName.matches(pattern)) {
		this.accountHolder=accountName;}
		else {
			System.out.println("Invalid");
		}
			
	}
	public void setAccountNumber(int accountNumber) {
		
		this.accountNumber=accountNumber;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	
	//getter for reading
	public String getAccounHolder() {
		return accountHolder;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	
	public void Deposit(double amount) {
		balance=balance+amount;
	}
	public void Withdraw(double amount) {
		balance=balance-amount;
	}
	
}


/*
 create costum class for bank account:
 		1. private data: accountHolder, accountNumber, Balance, PINNumber	
 		2. generate getters and setters		
 		3. action: depositing, withdrawing, availablebalance
 				try to use getter and setters in those actions

 */