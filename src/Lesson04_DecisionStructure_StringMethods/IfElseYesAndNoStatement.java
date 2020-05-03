package Lesson04_DecisionStructure_StringMethods;

import java.util.Scanner;

public class IfElseYesAndNoStatement {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		String responce;
		boolean accept=false;
		System.out.println("Would you like secret word?");
		                  responce=keyboard.next();
		 
		if(responce.equalsIgnoreCase("Yes")) {
			
			 System.out.println("Secret word is Letmein");
		 }
		 else if(responce.equalsIgnoreCase("No")) {
			System.out.println("Are you sure");
		 }
		
		 else System.out.println("Run program again and type Yes or No");
		
		
		
		
		
	}

	}


