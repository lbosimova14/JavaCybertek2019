package Lesson08_Method_Return;

import java.util.Arrays;

public class FindMaximumArrayValue {
	// write a method that accepts an int array and retuns the maximum number from the array
	public static void main(String[] args) {
		  int[] arr = {20, 30, 1, 2, 3, 5, 9};
	        int maxNum = maximum(arr);
	        System.out.println(maxNum);//30

	} 
    public static int maximum( int[] arr ) {//returning array value from method to main method
        
        Arrays.sort(arr);
        
        return arr[arr.length-1];
        }
}
