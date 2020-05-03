package Ass01_CybertekAssighments;

import java.util.Scanner;

public class Substrings {

	public static void main(String[] args) {
		
		/*Ask user to enter a word.If the work contains starts with x, print the word without x. 
		Input:
		xcode
		Output:
		code
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=scan.nextLine();
		
		if( word.startsWith("x"))
			System.out.println(word.substring(1));
		else
			System.out.println("Write a word, should starts with x");
	

/*
 *  Ask user to enter a word. If the first or second or both letter of the word is x, 
 *  print the word without x(s). If x is the third letter it should be printed.
 *   If the first and second are x, both should be ignored.
Input:
xxode
Output:
ode
Input:
oxidex
Output:
oidex
 */
		System.out.println("Enter a word:");
		String str=scan.nextLine();
		
		if( str.startsWith("xx"))
			System.out.println(str.substring(2));
		else
			System.out.println("Write a word, should starts with xx");
		
		
	}
}
		
		