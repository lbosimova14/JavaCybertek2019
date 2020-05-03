package Ass01_CybertekAssighments;

import java.util.Scanner;

public class HasJava {

	public static void main(String[] args) {
	
		 boolean exists = false;
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
	
	
	if(	word.substring(0).startsWith("java")||word.substring(1).startsWith("java"))
	System.out.println(true);
	else 
    System.out.println(false);
}
}	


/*Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
 *  such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = . 
 
Example:
input: javapython
output: true
Example:
input: cjavac++
output: true
Example:
input: c#javaruby
output: false */