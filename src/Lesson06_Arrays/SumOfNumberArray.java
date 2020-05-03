package Lesson06_Arrays;

import java.util.Scanner;

public class SumOfNumberArray{

	public static void main(String[] args) {
		
	    /*
	     ask user to enter five numbers,  then find the sum of 
	     those five numbers.
	     
	            MUST use Array
	     
	     */
	        int[] numbers = new int[5];
	        Scanner scan = new Scanner(System.in);
	        
	        for(int i= numbers.length -1 ; i >= 0; i--) {
	            System.out.println("Enter a number");
	                numbers[i] = scan.nextInt(); 
	                // assign user inputs to the Array's indexes
	        }
	        
	        
	        
	        for(int i=0; i < numbers.length; i++) {
	                System.out.print(numbers[i]+" ");
	        }
	}

}
