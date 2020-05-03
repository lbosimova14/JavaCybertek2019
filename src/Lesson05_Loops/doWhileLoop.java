package Lesson05_Loops;

import java.util.Scanner;

public class doWhileLoop {

	public static void main(String[] args) {

		   Scanner scan =new Scanner(System.in);
		int num1,num2;
		String input;
		char again=0;


		do {
			System.out.println("enter 1 number");
			num1=scan.nextInt();
			System.out.println("enter2 num");
			num2=scan.nextInt();
			
			System.out.println("sum"+(num1+num2));
			System.out.println("do you wonna continue");
			scan.nextLine();//consume remaining newline
			input=scan.nextLine();
			again=input.charAt(0);
			
		}while(again =='y'|| again =='Y') ;		

	}

}
