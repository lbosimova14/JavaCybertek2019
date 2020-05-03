package Ass01_CybertekAssighments;

import java.util.Scanner;

public class MiddleThreePrint_65 {

	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    int devide=0, middle=0;
		   
		    if(word.length()>=5) {
		    	if(word.length() %2==1 ) {   //odd string && even number
		    	  devide =word.length() / 2-1; 
		            middle = 3;
		            
		    	System.out.println(word.substring( devide,devide+ middle));}
		    	
		    	else if (word.length() % 2 == 0) {
		    		System.out.println("invalid");}
		    } else
		    	System.out.println("invalid");
		   
	}
		
	}
		/*You have a word, do the following:
			If the word has odd number of characters
			and has 5 or more characters, print the middle three 
			characters of the word. 
			Otherwise print "invalid".
			fifteen ==> fte
			apple ==> ppl
			hey ==> invalid
			java ==> invalid
			whatsup ==> ats
			$ ==> invalid*/

	/*Muhtar gitHub version:
	 * Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int length = word.length();

		if (length % 2 != 0 && length >= 5)
			System.out.println(word.substring(length / 2 - 1, length / 2 + 2));
		else
			System.out.println("invalid");

	}*/


