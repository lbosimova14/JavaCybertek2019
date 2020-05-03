package Lesson06_Arrays;

import java.util.Arrays;

public class TwoDemenEnhancedLoop {

	public static void main(String[] args) {
		   
        int[][] arr2D = {  { 1,2,3,4 }  , {5,6,7,8, 9}  };
                //            0              1
        
        for(int i = 0 ; i < arr2D.length; i++ ) {
                            // counts the 1D arrays
            for(int j=0;  j < arr2D[i].length ; j++ ) {
                System.out.print(arr2D[i][j] +" ");
            }   
        }
        
        System.out.println();
        
        
        for(int[] each1: arr2D) {
            for( int each2 :  each1) {
                System.out.print(each2+" ");

	}
        }
System.out.println();
	//another example
        int [] []array2D= {{2,2,3,4,5,22,33,44},{1,2,3,8,90,}};
		
        for( int[] e:array2D)   //[] Bracket ber
		for( int e2:e)         //convert e array to value
		System.out.print(e2+" ");
System.out.println();
//string example
 String [] [] str2D = {{"Laylo","Bosim"},{"Zunat","Max"}};
 for(String[]each1:str2D) 
	 //System.out.println(Arrays.toString(each1));//[Laylo, Bosim] Stringga aylantirsa 2-for loop kerak emas
                                              // [Zunat, Max] lekin braket yuqolmaydi
	 for(String EachValue: each1) 
	 System.out.print(EachValue+" ");//Laylo Bosim Zunat Max 
	 
//3 Dimensional array with enhansive for loop example	
 
 int[][][] num3D = {    { {1,2}, {3,4} } ,  { {5,6}, {7,8,9} }    };
 
 
 for(int[][] each2DArray : num3D ) {
     //  each2Darray: each 2 dimensional arrays that are contained with in the 3d array
     
     for(int[] each1DArray :  each2DArray ) {
         //  each1DArray:  each single dimensional arrays that are contained within 2d arrays
         
         for(int eachValues: each1DArray) {
             //eachValues: each values that are contained with 1D arrays
             System.out.print(eachValues +" ");
             
         }
     }
 }
 
 
 System.out.println();
	
	}
}