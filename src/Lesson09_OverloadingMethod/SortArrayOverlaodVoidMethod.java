package Lesson09_OverloadingMethod;

import java.util.Arrays;

public class SortArrayOverlaodVoidMethod {

	public static void main(String[] args) {
   // overloading: same method name , different parameters		         
	// overload method example: the sort methods of Arrays class, it accepts all data type
	//   VOID methods:      	         
	         int[] arr = {1,2,3,4,5};                 //it has 5 parameter
	         Sort(arr);  //5 4 3 2 1
	         
	         char[] ch = {'a', 'b', 'c'};               // it has 3 parameter
	            Sort(ch); //c b a 
	            	            
	         String[] str = {"A", "B", "C", "D"};        //    it has 4 prameter
	            Sort(str);	       //{D, C, B, A 	
	          
	           int []arr2 = {1,2,3,4,5,6};
	               Sort(arr2);
	        
	    }//main method ends
    // write method called sort, that can sort an int array in descending order
	   
	public static void Sort(int[] arr) {                   // 1. int Sort method 
	                            // [ 1,2,3,4,5};
	        Arrays.sort(arr);
	        for(int i = arr.length-1; i >=0; i--) {
	            System.out.print( arr[i]+ " " );
	     }
	          System.out.println();
	        
	    }
	    
	  public static void Sort(char[] arr) {                //   2. char Sort method
	        
	        Arrays.sort(arr);
	        for(int i = arr.length-1; i >=0; i--) {
	            System.out.print( arr[i]+ " " );
	        }
	        System.out.println();
	    }
	    
	    public static void Sort( String[] arr) {             //3. String Sort method
	        Arrays.sort(arr);
	        for(int i = arr.length-1; i >=0; i--) {
	            System.out.print( arr[i]+ " " );
	        }
	        System.out.println();
	    

	}

}
