package Lesson14_InstanceVariable;

/*WarmUp:
    create a custom class for BankAccount
    attributes/data that can have are: 
                    1. AccountHolder, 2. AccountNumber, 3. Balance
        Actions: deposit, withdraw, showBalance
        requiremnts: 
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                    2.1 if the withdrawing account is greater than available balance, 35$ charge will be added
                    2.2 if the balance is less than 0, user should not be able to withdraw money
            3. user should be able to see their balance*/
public class BankAccount {      //this is custom class
     //instance variable:declared in the class,outside of any methods(object variables)
	   String AccountHolder;
	   long AccountNumber;
	   double balance;
	   
	   //create default constructor,to avoid error on object class
	   public BankAccount() {
		   
	   }
	   
	   //create constructor
	 /*  public BankAccount(String name,long acctNum) {
		   AccountHolder=name;
		   AccountNumber=acctNum;
	   }*/
	   //same constructor but using same variable and useing this keyword
	   public BankAccount(String AccountHolder,long AccountNumber) {
		   //                    local variable  local variable
		   this.AccountHolder=AccountHolder;
		   this.AccountNumber=AccountNumber;}
	   //if names different you dont have to use this keyword
	   //if you use local variable exactly same as instance variable it will be more readable
	   //Without this keyword first check local variable then insttan variable, and does not print
	   //this keyword only use when local var and inst the same
	   //this(): used for calling constructor (dont mix up)
	   
	   //create instance method:method does not have static specifier.belong to object,execution is based on object
	   public void Showbalance() {
		   //convert to string,retrieve string then concate
		   String acct=""+AccountNumber;
		  String AccountNumber="**********"+acct.substring(12);
		   System.out.println("Account Holder: "+ AccountHolder);
		   System.out.println("Account Number: "+AccountNumber);
		   System.out.println("Available Balance: $"+ balance);
		  
	   }
		   //create deposed method
		   public void Deposit(double amount) {
			   System.out.println("----------------------------------------------------------");
			   String acct=""+AccountNumber;
			   String AccountNumber="**********"+acct.substring(12);
			   System.out.println("Depositing $"+amount+" to the account "+ AccountNumber);
			   //balance should increase
			   balance+=amount;
			   System.out.println("New balance: $"+balance);
		   }
		   
	    //create withdraw method, should decrease, parameter need(provader)
		   public void WithDraw(double amount) {
			   
			   System.out.println("----------------------------------------------------------");
			   
			   if(balance<=0) {
				   System.out.println("No available balance");
			   //should not print rest statement,if no available balanse and exit ,use return
			   return;
			   }
			   String acct=""+AccountNumber;
			   String AccountNumber="**********"+acct.substring(12);
			   System.out.println("Withdrawing  $"+amount+" from the account "+ AccountNumber);
			   balance-=amount;
			
			   if(balance<0) {
				   balance-=35;
				
			   }
			   System.out.println("New balance: $"+balance);
		   }
		   //creating instance method
		   public void accountSetUp(String name,long acctNum) {
			   AccountHolder=name;
			   AccountNumber=acctNum;
		   }


}
     
      

