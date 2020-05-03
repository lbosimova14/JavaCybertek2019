package Ass01_CybertekAssighments;

import java.util.Scanner;

public class replt_Ternary_053 {

	public static void main(String[] args) {
		   //Enter your code here
	    Scanner scan=new Scanner(System.in);
	  
	   // Scanner s = new Scanner(System.in);
	    
	    
	    System.out.println("Enter number1:");
			int num1 = scan.nextInt();
			System.out.println("Enter number2:");
			int num2 = scan.nextInt();
			//WRITE YOUR CODE HERE
			
		int result=(num1>num2) ? num1 :((num2>num1) ? num2 : 0);
	   
	System.out.println(result);
	  

	}

}
