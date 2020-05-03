package Lesson06_Arrays;

import java.util.Arrays;

public class ForEachEnhancedforLoopArray {

	public static void main(String[] args) {
		//format:  for (dataType elementVariable: array)
		//          statement;
		int[]arr= {2,3,4,5,6};
		for(int x:arr)
	    System.out.println(x);
		
			String[]str= {"hi","Mz"};
			String [] str2={"hi","Mzwww"};
			String str3=Arrays.toString(str2);
			for(String each:str)
			System.out.println(each.equalsIgnoreCase(str3));

	        /*
	            syntax:
	                    for(DataType each: ArrayName){
	                    
	                    }already itereted
	         */ 
	        
	        int[] ar = {1,2,3,4,5};
	        for(int i=0; i < ar.length; i++) {
	            
	            System.out.print( ar[i] );
	        }
	        System.out.println();
	        
	        
	        System.out.println("===================");
	        
	        for(int  each :  arr) {
	            System.out.print("enhansive loop "+each);
	        }
	        System.out.println();
	        
	        String[] str1  = { "A","B","C" ,"D","E","F" };
	        for( String values : str1   ) {
	            System.out.print( values );
	        }
	        
	        System.out.println();
	        
	        char[] ch = {'z', 'x' ,'y', 'c' ,'a'};
	        Arrays.sort( ch );
	        
	        for( char  charzzz  :   ch  ) {
	            System.out.print( charzzz );
	        }
	        System.out.println();
	        
	        
	        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
	        
	        for( int  varname : arr1 ) {
	            
	            if( varname %2 == 0)
	                System.out.print( varname +" ");//even number
	            
	        }
	        
	        System.out.println();
	        
	        
	        for( int  varname : arr1 ) {
	            
	            if( varname %2 != 0)
	                System.out.print( varname +" ");//odd number
	            
	        }
	        System.out.println();	
		
	        int [] []arr2D= {{2,2,3,4,5},{1,2,3,8,90,}};
		
	        for( int[] e:arr2D)   //[] braket ber
			for( int e2:e)         //convert e array to value
			System.out.print(e2+" ");

	}

}
