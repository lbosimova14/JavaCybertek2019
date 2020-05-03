package Ass02_ArrayReplit;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();//It is the number to calculate factorial
		    int i,fact=1;  //I need inisilaz local variable, i cannot inisilaz 0, bc anynumber*0=is 0
		       
		    for(i=n;i>0;i--){    
		        fact=fact*i;    
		    }    
		    System.out.println("Factorial of "+n+" is: "+fact);   

	}

}//20922789888000 16
/*In mathematics, the factorial of a positive integer n, denoted by n!,
 is the product of all positive integers less than or equal to n.  
 Calculate factorial and output result to the console. 
Example:
input: 5
output: 120 */