package Lesson08_Method_Return;

import java.util.Arrays;

public class LargestNumberArraySort {
	 // write  method that accepts 3 numbers and returns the largest number
	public static void main(String[] args) {
		   
        int max = (int) greaterNumber(90, 200, 30);  //double is casting bulayapti
        // it's gonna be reusable if we assign to a variable
        
        System.out.println(max);//200
        //System.out.println( greaterNumber(90, 200, 30)  ); can write inside s.o.p without assigning 
	}

    
    public static double greaterNumber(int a, int b, int c) {
        int[] arr = { a, b, c };
        //          {1 ,2 ,3};
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
