package Ass01_CybertekAssighments;

import java.util.Scanner;

public class LongestLetterLengthCompare_61 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    //WIRTE YOUR CODE HERE
		    int longest=word1.length();
		    int longestNext=word2.length();
		   
		    if(longest>longestNext)
		    System.out.println(word1);
		    else
		    System.out.println(word2);

	}

}
/* Muhtar gitHub version:
Scanner scan = new Scanner(System.in);
String word1 = scan.next();
String word2 = scan.next();
// WIRTE YOUR CODE HERE

if (word1.length() > word2.length())
	System.out.println(word1);
else
	System.out.println(word2);*/