package Ass01_CybertekAssighments;

import java.util.Scanner;

public class VerifyContainsMethod_60 {
//Write a program that will verify if word contains in the sentence.
//Print out the result as boolean value. 
	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		    String word = scan.nextLine();
		    String sentence = scan.nextLine();
		    
	 boolean result = sentence.contains(word);
		        if(result) {           
	    
		        System.out.println("true");

		        }else {

		            System.out.println("false");
		        
	}
	}
}
/* Muhtar version:
 * if (sentence.contains(word) == true)
			System.out.println(true);

		else
			System.out.println(false);*/
