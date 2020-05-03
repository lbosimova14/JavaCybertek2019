package Ass03_MethodReplit;

import java.util.Arrays;

public class Merge2Arrays_178 {

		  public static int[] mergR(int[] a,int[] b) {
			    
		      //Declare the result string with the sum of sizes.
		    int [] result = new int[a.length + b.length];
		    //Assign `x` values to result.
		    for (int i = 0; i < a.length; i++) {
		      result[i] = a[i];
		    }

		    //Assign `y` values to result. Using resultIndex to start on the first empty position while `i` will be the index for the `y` array.
		    for (int i = 0, resultIndex = a.length; i < b.length; i++, resultIndex++) {
		      result[resultIndex] = b[i];
		    }
		    return result;
		  
		    
		  }//end mergR
		  
		  public static void main(String[] args) 
		  {
		   int[] array1 = {1,2,3};
		   int[] array2 = {4, 5, 6};
		   
				     System.out.println(Arrays.toString(mergR(array1,array2)));
		  }
		}
	  
		    	     
		 /*  
		  * 
		  *   int[] c = new int[a.length + b.length];//should array3 cable of all 2 array
		now this array has enough capacity to contain all the elements of array
		  now gives only 0000000 because we initialized size, not value
		     
		     for(int i=0; i <a.length; i++) {
		         c[i] = a[i];  //copying individual elements
		         // assigning array1' each index to the array3
		     }
		     
		       for(int i=0; i < c.length; i++) {
		         System.out.print(c[i]+" "); //1 2 3 0 0 0
		         // (ret[z]=a[i];)
		     }
		       System.out.println("\n second part");
		       
		       // second part
		       for(int i=0; i <b.length; i++) {
		           c[i+a.length] = b[i];  
		           // assigning array2' each index to the array remaining index
		       }
		       int []z=0;
		         for(int i=0; i < c.length; i++) {
		            z= (c[i]);//1 2 3 4 5 6 7
		         }
		         return z;
		       
		}
		    
	  }//end mergR
	  
	  public static void main(String[] args) 
	  {
		  int[] array1 = {1,2,3};
		     int[] array2 = {4, 5, 6, 7};
		     System.out.println(mergR(array1,array2));
	  }
}*/
/*mergR merges two arrays into one.
it gets two int arrays and returns an int array
for example:
mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]
mergR([1,2],[6,8])
returns [1,2,6,8]
hint:
    create a length int for the combined length of both arrays.
    create an array with that length (thats the array we will return).
    create an iterator for both arrays (int z=0).
    loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
    then increment the iterator for both arrays (z++).
    do the same for the second array.*/