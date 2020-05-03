package Lesson21_MethodOverriding;
//@ Override: initation is used verify if the method is override or not

public class Bank {

	public static void main(String[] args) {
		//create object in order call instance  InterestRate() methods
		BankOfAmerica BOA =new BankOfAmerica();
		Chase c =new Chase();
		Pnc pnc=new Pnc();
		//override
		  BOA.InterestRate();// Before creating override method --> 9 percent, after created override method --> Bank Of amerika interest rate is 3%  
		  c.InterestRate();   //9 percent
		  pnc.InterestRate();//9 percent
		
	}//main method ending
	
	
	public void InterestRate() {
		System.out.println("9 percent");
	}
	
}//public class ending
class BankOfAmerica extends Bank{
	// sub                  super
	
	//overriding super class (InterestRate() method) this method sharing with 3 sub classes
	public void InterestRate() {
		System.out.println("Bank Of amerika interest rate is 3%");
	}
	
}

class Chase extends Bank{
	@Override  //if this method not overiding then this @ sing gives error
	public void InterestRate() {
		System.out.println(" chase   4 percent");
	}
	
	//this not overriding,when I apply this @Override or not 
	//@Override
	// public void print() {}  yes,this not overriding that is why giving compile error
	 
	
}

class Pnc extends Bank{
	
	public void InterestRate() {
		System.out.println("  pnc bank is 1 percent");
	}
}