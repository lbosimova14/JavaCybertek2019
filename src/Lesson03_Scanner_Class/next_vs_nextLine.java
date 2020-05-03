package Lesson03_Scanner_Class;

import java.util.Scanner;

public class next_vs_nextLine {
	public static void main(String[] args) {
		  
	    /*
	     next() vs nextLine();  ==> returns String value
	                nextLine: takes the entire inputs
	                next: takes the first word
	     */
	   
	        Scanner  scan = new Scanner(System.in);
	        System.out.println("Enter your first name");
	            String firstname = scan.next();//enter 1 ta word,agar 2 yo orqiq word yozsa .nextLine ishlat
	                                               //inputMismatchException occur
	        System.out.println("Enter your last name");
	        String lastname = scan.next();
	        
	        System.out.println("first name is: "+firstname);
	        System.out.println("last name is: "+lastname);
		
	        //nextLine VS nextInt,nextDouble.......
	        
	        System.out.println("Enter phone number and name");  // if you hit enter  multple line you still can write number
	                 int pn=scan.nextInt();
	                                                         // and agar nextLine yozsang after nextInt still not allowing any value, it reads everthing
	                                                         //up to the new line charecter
	     // scan.nextLine();
	        String name=scan.nextLine();
	        //nextLine will take everything in scanner's memory(including "Enter" uo-to the new line
	        
	        
	        //another eg
	        
	        int n=scan.nextInt(); //enter, ignore enter,can still enter
	        String numb=scan.nextLine();//accepts the "enter from keyboard"
	        System.out.println("hello");

	        // another explainee
	        
	        System.out.println("Enter your first name");
			String f = scan.next();
			
		System.out.println("Enter the last name");
			String L = scan.next();
			
			System.out.println("Your first name is "+f);
			System.out.println("Your last name is "+L);     
	        
	        
	}

}
