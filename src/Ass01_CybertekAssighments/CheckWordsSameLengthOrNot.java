package Ass01_CybertekAssighments;

import java.util.Scanner;

public class CheckWordsSameLengthOrNot {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Write 3 word:");
		String word1=scan.nextLine();
		String word2=scan.nextLine();
		String word3=scan.nextLine();
	int firstWord=word1.length();
	int secondWord=word2.length();
	int thirdWord=word3.length();
		if (firstWord==secondWord && firstWord==thirdWord )
		 System.out.println("All words are same length");
		else if(firstWord==secondWord || firstWord==thirdWord || secondWord==thirdWord)
		  System.out.println(" Not Same nor Different lengths");
		else
		  System.out.println("All different length");
		
		
/*Write a program CheckWords:

			Program accepts 3 words and :
			- if they are same length:      print "All words are same length"
			- if some same length and others not:    print "Not Same nor Different lengths"
			- if all different length :  print "All different length"
	 */
	

	}

}
