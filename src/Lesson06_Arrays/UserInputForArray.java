package Lesson06_Arrays;

import java.util.Scanner;

public class UserInputForArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many friend name you want enter? ");
		int nameLength=scan.nextInt();
		String [] arrNames = new String [nameLength];
		
		for(int i=0;i<nameLength;i++) {
			System.out.println("Enter name of  your friend " +(i+1));
			arrNames[i]=scan.next();
		}
		
         scan.close();
         System.out.println("Your friend are :");
         for(int i=0;i<nameLength;i++) {
        	 System.out.println(i+1+" "+arrNames[i]);
         }
	}

}
