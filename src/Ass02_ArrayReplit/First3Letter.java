package Ass02_ArrayReplit;

import java.util.Scanner;

public class First3Letter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		//leave above alone!  write your code below
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()>=3) {
		
			String element=arr[i].substring(0,3);
			
			System.out.println(element);
		}

	}
	}
}
/*The code provided in your main method will take in five Strings and save them into an array called arr. 
 *  Print out the first three letter of each element of arr, one per line. 
 *   You can assume that every element of arr is at least 3 letters long.
Example:
arr -> ["apple", "banana"] 
 prints: app
         ban*/