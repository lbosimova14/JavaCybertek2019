package Lesson05_Loops;

import java.util.Scanner;

public class Examples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int minnum=99999;
		 for(int i=0;i<=5;i++) {
			 System.out.println("Enter number");
			 int input=scan.nextInt();
			 if(input<minnum) {
				 minnum=input;
			 }
		 }
		 System.out.println(minnum);

	}

}
