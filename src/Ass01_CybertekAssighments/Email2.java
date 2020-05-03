package Ass01_CybertekAssighments;

import java.util.Scanner;

public class Email2 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     String email = scan.next();
		  
		   String fname=email.substring(0,email.indexOf("_"));
		   String lname=email.substring(email.indexOf("_")+1,email.indexOf("@"));
		   String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
		   String tdomain=email.substring(email.indexOf(".")+1);
		   fname=fname.substring(0,1).toUpperCase()+fname.substring(1).toLowerCase();
		   lname=lname.substring(0,1).toUpperCase()+lname.substring(1).toLowerCase();
		   System.out.println("First name: "+fname);
		   System.out.println("Last name: "+lname);
		   System.out.println("Domain: "+domain);
		   System.out.println("Top-Level Domain: "+tdomain);
		 
	}

}
/*
 * Write a program that will print out information about user based on email.
 *  Print first and last name from the upper case.
Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
 */
