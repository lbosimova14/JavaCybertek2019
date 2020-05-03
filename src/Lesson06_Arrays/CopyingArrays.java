package Lesson06_Arrays;

import java.util.Arrays;

public class CopyingArrays {

	public static void main(String[] args) {
//1.	This program demonstrate two variables can reference the same array
		int[] array1 = { 2, 4, 6, 8, 10 };
	      int[] array2 = array1;//this does not copy array1
//This reference copy only the address of the  array object is coppied, not the contents of array object
	      // Change one of the elements using array1.
	      array1[0] = 200;

	      // Change one of the elements using array2.
	      array2[4] = 1000;

	      // Display all the elements using array1
	      System.out.println("The contents of array1:");
	      for (int value : array1)
	         System.out.print(value + " ");
	      System.out.println();

	      // Display all the elements using array2
	      System.out.println("The contents of array2:");
	      for (int value : array2)
	         System.out.print(value + " ");
	      System.out.println();
	    /*  The contents of array1:
	    	  200 4 6 8 1000 
	    	  The contents of array2:
	    	  200 4 6 8 1000 */
	      
//2. to copy array----- you need copy individual element of one array to another, best done with loop
	
		int[]a= {3,8,6,1,};
		int []b=new int[a.length];
		a[0]=10;
		for(int i=0;i<a.length;i++) {		 
			b[i]=a[i];
			System.out.print(" "+b[i]); // 3 5 6 1
		
	}
}
}
