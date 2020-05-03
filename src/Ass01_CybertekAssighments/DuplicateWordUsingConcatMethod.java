package Ass01_CybertekAssighments;

import java.util.Scanner;

public class DuplicateWordUsingConcatMethod{

	public static void main(String[] args) {
/*  Ask user to enter two words. Print the first word, second word, second word, first word
		Input:
		one
		two
		Output:
		onetwotwoone 
		 */
		Scanner scan = new Scanner(System.in);
		String word1, word2;

		System.out.println("Enter two words:");
	    word1=scan.nextLine();
	    word2=scan.nextLine();
	   System.out.println(word1+ word2 +word2 + word1);
	   // System.out.println(word1.concat(word2)+word2.concat(word1));

	/*Ask user to enter two words. Then add them together and print.
Input:
one
eight
Output:
oneeight
	 */
	    System.out.println("Enter two words:");
	    String a=scan.nextLine();
	    String b=scan.nextLine();
	    System.out.println(a.concat(b));
	
	/* Ask user to enter two words. Then add them together and print.
	 *  But if the last letter if the first word and the first letter of the last letter is the same,
	 *  print that character once.
Input:
one
eight
Output:
oneight
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}


