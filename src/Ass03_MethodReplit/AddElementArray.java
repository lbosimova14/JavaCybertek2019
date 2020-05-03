package Ass03_MethodReplit;

import java.util.Arrays;

public class AddElementArray {

	public static void main(String[] args) {
   /*       
    * Java Program to add two integer arrays. Since Java
		does't support operator overloading you cannot
		 * add two arrays using + operator, instead you need
		 * to loop over array and add each element one by one. 	*/	
      int[] arr1= {10, 40, 50, 3, 1};
      int [] arr2= {11, 0, 500, 44, 1101};
      System.out.println(Arrays.toString(addElements(arr1,arr2)));

	}
	 public static int[] addElements(int[] ints1, int[] ints2) {
		 
		    int ints3 = ints1.length<ints2.length ? ints1.length :ints2.length;
		    int [] result = new int [ints3];
		    for (int i=0;i<ints3;i++) {
		    	result[i]=ints1[i]+ints2[i];
		    }
		    
		    return result;
	  }
}
/*Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array. You can assume that each array has 5 elements
addElements(new int[][10, 40, 50, 3, 1],
            new int[][11, 0, 500, 44, 1101]);
--------
return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]
*/