package Lesson06_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReviewMinMaxScannerClass {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	//ask user to enter 3 numbers and find maximum and minumum numbers
	
	
	
	//agar usurdan surasam qancha raqam kiritmoqchisan deb :
	
	   System.out.println("How many numbers would you like to add?");
       int number = scan.nextInt();
        // int[] arr = new int[number]; user number varablni braketni ichiga quyaman,loop ichidagi arr.length ni number deb uzgartiraman
       
       int[]arr= new int[10];
	System.out.println("Enter number");
	arr[0]=scan.nextInt();
	//bitta 10 raqam kiritish urnuga user inputni loopni ichiga kirit, uzi 10 marta suraydi
	for(int i=0; i < arr.length; i++) {  
        System.out.println("Enter a number: ");
             arr[i] =  scan.nextInt();  // user input}
//	print out qilish uchun stringga aylantir
	System.out.println(Arrays.toString(arr));
	
	// to find max number, beat way is sort array first, then assending array
	Arrays.sort(arr);
	System.out.println("min"+arr[0]);
	System.out.println("max"+arr[arr.length-1]);
	

	}
	}
}
