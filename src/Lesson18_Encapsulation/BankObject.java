package Lesson18_Encapsulation;

import java.util.Scanner;
public class BankObject {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		//object
		Bank account =new Bank();
		System.out.println("What is the account holder name");
		String UserName=scan.nextLine();
		account.setAccountHolder(UserName);
		
		System.out.println("What is the account number");
		int UserNumber=scan.nextInt();
		account.setAccountNumber(UserNumber);
		
		System.out.println("What is your account's starting balance?");
		double userBalance=scan.nextDouble();
		account.setBalance(userBalance);
		
		System.out.println("How much were you paid this month? ");
		 double UserDeposit=scan.nextDouble();
		 account.Deposit(UserDeposit);
		 System.out.println("Your pay has been deposited.\nYour current balance is "+account.getBalance());
		
		
		System.out.println("How much would you like to withdraw from your account?" );
		double UserWithdraw=scan.nextDouble();
		account.Withdraw(UserWithdraw);
		System.out.println("Now your account balance is "+account.getBalance());
		

	}

}
