package Lesson08_Method_Return;

import java.util.Arrays;

public class SortDesindingArray {
	 // write a method that accepts an int array and sorts it then returns an array
	public static void main(String[] args) {
		int []array= {8,6,55,4,3,22,7,6,6,66,6,99,0};
		array=Descending(array);//should inisiliz first, 
		System.out.println(Arrays.toString(array));//[99, 66, 55, 22, 8, 7, 6, 6, 6, 6, 4, 3, 0]

	}
public static int [] Descending (int[] arr) {
	Arrays.sort(arr);
	int []numbers=new int[arr.length];//numbers array has name length with
	
	int z=0;
	for(int i=arr.length-1; i>=0;i-- ) {
		numbers[z]=arr[i];
		z++;
		
	}
return numbers;
}
}
