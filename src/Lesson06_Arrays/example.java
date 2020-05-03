package Lesson06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class example {

	public static void main(String[] args) {
	
		String str= "Hello World, I am Laylo";
		String [] arr=str.split(" ");
		
		System.out.println(Arrays.toString(arr));
//		for( String  each: arr) {
//			System.out.println(each);
//			
//		}
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		char [] chArr= str.toCharArray();
		System.out.println(Arrays.toString(chArr));
		
	}
	

}
