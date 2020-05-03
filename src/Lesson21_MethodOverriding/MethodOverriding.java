package Lesson21_MethodOverriding;
/*Overloading Vs Overriding
 * method overloading:  same name, different parmeter
                    return type doesn't matter
                    access modifiers don't matter
                    any method can be overload  
method overriding: same name, same parameters, implementation functionality is different
                    Return-Type MUST be same
                    cannot happen in the smae class
                    method MUST be override in sub class
                    ONLY THE INSTANCE METHODS CAN BE OVERRIDE
                    constructor and static methods cannot be overriden
                    private methods cannot be override
                    the method we are going to override MUST be inheritable to the sub class
                    override method' access modifiers need to be same or more visible
                                default ==> deafult, protected, public
                                protected ==> protected, public
                                public ==> public
                                private ==> cannot be overridden
                            public > protected > default > private
 */

class student {
	 
	public void printName() {
		System.out.println("Laylo");
	}
	
}



public class MethodOverriding extends student{
	     //   sub                       super
        
	public void print(String str) {
		
		
	}
	//overload method
	public void print (double a) {
		
	}
	//override method should be in sub class
	//same name and same parameter but different functionality,(printing shukran)
	public void printName() {
		System.out.println("Shukran");
	}
	
	//try to override,but gives compile error, bc overriding cannon happen in the same class,try another class
    //public void print(String str) {}   when you try to override to another class. should be relationship
		
		public static void main(String[] args) {
			
			MethodOverriding obj = new MethodOverriding();
			obj.printName();//this method calling sub class and doing exactly same functionality
			student obj2 =new student(); 
		     obj2.printName();
		     
		     
		     
		}
	
}
/* Eg:
 * super class: Bank
 * actions : InterestRate()   default interest rate is 9%
 * 
 * sub classes: BankOfAmerica  ====>7%
 *             Pnc            ====> 6%
 *             CapitalOne      ====> 8%
 * if i dont override, it prints me 9%
 * */
 