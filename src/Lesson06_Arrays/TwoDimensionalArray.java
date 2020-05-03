package Lesson06_Arrays;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*
		 * n dimensional array contains(n-1)dimensional array
		 * 2 Dimensional array: array that contains 1 dimensional arrays
		 */

        int[] arr1D = {1,2,3};
        
    //  2 dimensional array: array that contains multiple 1 dimensional arrays
        
        int[][] arr2D  = {  {1,2,3}  ,  {4,5,6}   };//Separates by comma
        
        
        String[] arr = {"A" ,"B"};//one dimensional
        
        //                         0   1         0    1    2
        String[][] str2D  =   {  {"A" ,"B"} ,  {"C" ,"D","E"}     };
        //                           0            1
        
// [represents the index number of 1 dimensional arrays ][ represents the index number of the values]
        
                // print A:
                System.out.println( str2D[0][0] );//A
                
                // print D:
                System.out.println( str2D[1][1] );//D
                
                //print E:
                System.out.println(str2D[1][2]);//E
        
                // print [A ,B]:
                System.out.println( str2D[0] );//[Ljava.lang.String;@24d46ca6 hash code beradi,chunki stringa convert qilinmagan
                System.out.println(  Arrays.toString( str2D[0] ) );//[A, B]
                
                // print [C, D, E]:
                System.out.println(  str2D[1] );//hash code
                System.out.println( Arrays.toString( str2D[1] ));
                
                
                //print [[A,B], [C, D, E]]
                System.out.println(  Arrays.toString(str2D) );
                System.out.println(  Arrays.deepToString( str2D ) );
    
            // Arrays.deepToString(variableName ): converts multi-Dimensional Arrays to STring value
               
      //int example          
            //                       0 1       0  1     0  1 
            int[][]  Numbers2D = {  {1,2}  ,  {3, 4} , {5, 6, 7, 8, 9 , 10}  };
            //                         0        1         2
                
                // print 6:
            System.out.println( Numbers2D[2][1] );
            
                // print 10:
            System.out.println( Numbers2D[2][5] );//needs 2 braket
            
                // print {5, 6, 7, 8, 9 , 10}:
          
            System.out.println( Arrays.toString(  Numbers2D[2]  ) );
            
                // print the entire 2D array:
            System.out.println(Arrays.deepToString(  Numbers2D ));//needs put in paranthesis//[[1, 2], [3, 4], [5, 6, 7, 8, 9, 10]]
	}

}
