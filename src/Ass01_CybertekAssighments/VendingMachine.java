package Ass01_CybertekAssighments;
import java.util.Scanner;
public class VendingMachine {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
	   
    	System.out.println("Enter price in cents:");
    	int cost = keyboard.nextInt();
    	
    	//Determine how much change is left over
    	int Quarters = ((100-cost)/25);
    	int Dimes = ((100-cost-(Quarters*25))/10);
    	int Nickles = ((100-cost-(Quarters*25) - (Dimes*10))/5);
   
    	//Display results to user
    	System.out.println("Your change is:\n" +
    			Quarters + " Quarters\n" +
    			Dimes + " Dimes\n" +
    		    Nickles + " Nickels\n");	
		

	}

}
/*Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.
Input: 
Enter price in cents: 95↵
Output:
Your change is 0 quarters, 0 dimes, and 1 nickels.
Remember:
1 quarter = 25 cents.
1 dimes = 10 cents.
1 nickels  = 5 cents.
you will need to use assignment and short hand operators for this task. Good luck (edited)*/