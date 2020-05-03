package Lesson18_Encapsulation;

public class BankAccount {
	private String AccountHolder;
	private long AccountNumber;
	private double AvailableBalance;
	
	
	//getter for reading,instance return method
	public String getAccountHolder() {
		return AccountHolder;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public double getAvailableBalance() {
		return AvailableBalance;
	}
	//setter for writing
	public void  setAccountHolder(String AccountHolder) {
		this.AccountHolder=AccountHolder;
	}
	
	public void setAccountNumber(long AccountNumber) {
		this.AccountNumber=AccountNumber;
	}
	//actions:
	//deposit:
	public void deposit(double amount) {
		AvailableBalance+=amount;
	}
	//withdraw
	public void withdraw(double amount) {
		/*if(AvailableBalance<=0) {//we should exit method
			System.out.println("your account balance is less or equla to 0");
			return;
		}
		if(amount>AvailableBalance) {
			AvailableBalance-=35;
		}
		AvailableBalance-=amount;*/
		//or use if else statament
		if(AvailableBalance<=0) {
			System.out.println("your account balance is less or equla to 0");
		}else if(amount>AvailableBalance) {
			AvailableBalance-=35;
			AvailableBalance-=amount;
			
		}else {
			AvailableBalance-=amount;
		}
		}
	//cheking balance:
	public void ShowBalance() {
		System.out.println("Available balance is: "+AvailableBalance);
	}
  //get account info: every time when i call this method,should display those information
	public void getInfo() {
		System.out.println("Name: "+getAccountHolder());
		System.out.println("Account Number:"+ getAccountNumber());
		System.out.println("Available balace: "+ getAvailableBalance());
	}
}
/*WarmUp: creata a custom class for bankaccount
The attributes/data that the class can have are: 
AccountHolder, AccountNumber, AvailableBalance
Actions the class can do are:
deposit, withdraw, checking balance
requiremnets:
1. apply encapsulations
2. user should be able to deposit, withdraw and check the balance
    2.1 if the withdrawing amount is greater than available balance, 35$ penalty fee will be charger from the account
    2.2 if the available balance is less or equal to 0, account holder won't be able to withdraw money*/