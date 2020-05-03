package Ass01_CybertekAssighments;

public class Array_PrintingFirst3Letter {

	public static void main(String[] args) {
		
		String[] arr = {"banana","apple","orange","kivi","ananas"};
	
        for(int i=0;i<arr.length;i++) 
        System.out.println(arr[i].substring(0, 3)+" ");
      
	}
}
//}
/*
Write a program that will take five Strings and save them into an array called arr. 
 Print out the first three letter of each element of arr, one per line. 
 You can assume that every element of arr is at least 3 letters long.
Example:
arr -> ["apple", "banana"]
prints: app
        ban*/