package Lesson05_Loops;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		isPolyndrome("mome");
		
     }//main method ending
 
public static void isPolyndrome(String original) {
	String reverse="";
	for(int i=original.length()-1;i>=0;i--) {
		reverse+=original.charAt(i);
	}
	if(original.equalsIgnoreCase(reverse)) {
		System.out.println("Polyndrome");
	}else {
		System.out.println("Not");
	}
}



}//class ending


	
	
		
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


