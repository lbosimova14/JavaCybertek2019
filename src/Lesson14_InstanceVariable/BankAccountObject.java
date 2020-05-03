package Lesson14_InstanceVariable;

public class BankAccountObject {

	public static void main(String[] args) {
		
		
		//create object
		BankAccount account1=new BankAccount();// 
//		class                      constructor
		//set up account holder
		
        account1.AccountHolder="Erhan Dolapci";
        account1.AccountNumber=1234567891234567L;
        //check balance of account,call method
       account1.Showbalance();
	   account1.Deposit(2000);
	   account1.Deposit(4000);
	   account1.WithDraw(3000);
	   account1.WithDraw(3001);
	  account1.WithDraw(222);
	  
	  //create another object
	  BankAccount account2= new BankAccount();
	  account2.accountSetUp("Muaz Gulen", 2224445556667778L);
	  account2.Showbalance();
	  account2.Deposit(1000);
	  account2.WithDraw(500);
	  //if you create constructor, create claas objectexisting constructor
	  BankAccount account3= new BankAccount("Nodira Palot",1234567897123462L);
		  account3.Showbalance();
		  account3.Deposit(10);
		  account3.WithDraw(30);
		  
	  
	
	}
	

}
