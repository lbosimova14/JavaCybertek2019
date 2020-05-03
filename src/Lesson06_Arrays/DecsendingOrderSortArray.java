package Lesson06_Arrays;

import java.util.Arrays;

public class DecsendingOrderSortArray {

	public static void main(String[] args) {

	    /*
	     write program that can print the arrays in Decsending order (largest to smallest)
	     
	     */
	    int[]  MyNumbers = { 99,10,200, 3000, 40, 50, 5000};
	        Arrays.sort(MyNumbers);
	                // MyNumberw -> [10, 40, 50, 99, 200, 3000, 5000]
	        //                        0   1   2   3   4    5      6
	        
	        System.out.println( Arrays.toString(MyNumbers) );
	    
	        String result ="[";
	        for(int i = MyNumbers.length-1; i  >= 0; i--) {
	            
	             result += MyNumbers[i] +", " ;
	            
	        }
	                System.out.println();
	                
	        result = result.substring(0, result.length()-2)+"]"; 
	                
	                System.out.println(result);
	    
	                
	    int[] arr2 = { 99,10,200, 3000, 40, 50, 5000};
	        Arrays.sort(arr2);  //  array will be sorted in Acsending order
	    //  arr2 -> [10, 40, 50, 99, 200, 3000, 5000]
	        //        0  1   2    3   4    5     6
	        
	        int[] Decedning = new int[arr2.length];
	        /*
	            Decedning[0] = arr2[6];
	            Decedning[1] = arr2[5];
	            Decedning[2] = arr2[4];
	            Decedning[3] = arr2[3];
	            Decedning[4] = arr2[2];
	            Decedning[5] = arr2[1];
	            Decedning[6] = arr2[0];
	        */
	        
	        int z=0;
	        for(int i = arr2.length-1; i >=0; i-- ) {
	            Decedning[ z ] = arr2[i];
	            z++;
	        }
	        
	        System.out.println( "Acsending order: "+ Arrays.toString(arr2));
	    
	        System.out.println("Descedning order: "+Arrays.toString(Decedning));

	}

}
/*
Fatih way
int[] n1={50,200,10,99,40,5000,3000};
Arrays.sort(n1); 
System.out.println("accending order : "+Arrays.toString(n1));// [10, 40, 50, 99, 200, 3000, 5000]
int[]n2=new int[n1.length];
for(int i =n1.length-1,j=0;i>=0;i--,j++) {
    n2[j]=n1[i];
}
System.out.println("Descending order : "+Arrays.toString(n2)); //[5000, 3000, 200, 99, 50, 40, 10]
}*/