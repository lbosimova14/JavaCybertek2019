package Ass01_CybertekAssighments;

import java.util.Scanner;

public class PrintHalfTwice {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		  
		  int half = word.length() / 2 ;
System.out.println(word.substring(0,half)+word.substring(0,half)); //prints long character 
		                                                                            //divide half 
		    
//System.out.println(""+word.charAt(0)+word.charAt(1)
		                         // +word.charAt(0)+word.charAt(1));       //prints only 4 character
// System.out.println(word.substring(0,2)+word.substring(0,2));

	}

}
