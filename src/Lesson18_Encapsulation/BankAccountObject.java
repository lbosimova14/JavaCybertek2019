package Lesson18_Encapsulation;

public class BankAccountObject {

	public static void main(String[] args) {
		BankAccount Sarah=new BankAccount();
		Sarah.setAccountHolder("Sarah Abdijabbar");
		Sarah.setAccountNumber(123456789);
		//System.out.println("Name: "+Sarah.getAccountHolder());
		//System.out.println("Account Number:"+ Sarah.getAccountNumber());
		//System.out.println("Available balace: "+ Sarah.getAvailableBalance());
		
		Sarah.deposit(2000);
		Sarah.ShowBalance();//2000
		
		Sarah.withdraw(2500);
		Sarah.ShowBalance();//-535.0 penalty
		Sarah.deposit(10000);
		Sarah.ShowBalance();//9465.0
		
		System.out.println("______________________________________");
		BankAccount Serkan=new BankAccount();
		Serkan.setAccountHolder("Serkan");
		Serkan.setAccountNumber(567897655);
		
		Serkan.getInfo();
		
		Serkan.deposit(300);
		Serkan.ShowBalance();
		Serkan.withdraw(50);
		Serkan.getInfo();
		
		//use Array

	}

}
