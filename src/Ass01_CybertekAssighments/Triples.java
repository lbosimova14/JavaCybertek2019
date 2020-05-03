package Ass01_CybertekAssighments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Triples {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		   String str = scan.next();
		   int count = 0 ;
		   //WRITE YOUR CODE HERE

		   for (int i=0; i<str.length()-2;i++){
		     if (str.charAt(i)==str.charAt(i+1) &&
		     str.charAt(i)==str.charAt(i+2))
		     count++;
		   }
		   System.out.println(count);
	
	
	}
}
/*
a "triple" in a string is a char appearing three times in a row.
Write a program that can print out the number of triples in the given string. 
Example:
input: abcXXXabc
output: 1
 
Example:
input: xxxabyyyycd
output: 3
 
Example:
input: java
output: 0
*/