package Lesson05_Loops;

import java.util.Scanner;

public class YesOrNoWhileLoop {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		   while(true) {
			System.out.println("Enter first number");
		   int n1=scan.nextInt();
		   System.out.println("Enter second number");
		   int n2=scan.nextInt();
		   System.out.println("additon is:"+(n1+n2));
		   System.out.println("Do you wonna continue");
		   String answer=scan.next();
		   
			if(answer.equalsIgnoreCase("no")) {
				break;
			}else {
				System.out.println("Complited");
			}
		   }

	}

}
