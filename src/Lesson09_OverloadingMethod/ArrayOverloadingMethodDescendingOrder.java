package Lesson09_OverloadingMethod;

import java.util.Arrays;

public class ArrayOverloadingMethodDescendingOrder {
   /* Warm up:
    write a return method that accepts an int array and sorts it in descending order
    write a return method that accepts a double array and sorts it in descending order
    write a return method that accepts a char array and sorts it in descending order
    write a return method that accepts a String array and sorts it in descending order
        Hint: method overloading is prefered here*/
	
	public static void main(String[] args) {
	        
	        int[] arr = {10,89,20,300,10,900, 0, 1};        
	            arr =   SortDe(arr);            
	            System.out.println( Arrays.toString( arr ) );//[900, 300, 89, 20, 10, 10, 1, 0]
	            
	        double[] arr2 = { 10.5, 5.5, 300, 2.0, 6.5};               
	            // arr2 = SortDe( arr2 );//qisqartirib yozasa habuladi in sout ichiga
	            System.out.println(   Arrays.toString(  SortDe( arr2 ) ) );
	       
	        char[]chArr= {'c','d','f','t','y'};
	         chArr=SortDe(chArr);
	         System.out.println(Arrays.toString(chArr));
	        
	        String [] names= {"Laylo","Bosim","Max","Lax","Nano","Hola"};
	            System.out.println(Arrays.toString(SortDe(names)));//[Nano, Max, Laylo, Lax, Hola, Bosim]
	         
	        Integer []arrInteger= {23,4,5,6,7,6,5,4,3,349,23};
	        System.out.println(Arrays.toString(SortDe(arrInteger)));//[349, 23, 23, 7, 6, 6, 5, 5, 4, 4, 3]
	         
	    }//main method ending
	  //int method    
	    public static int[] SortDe(int[] arr) {	        
	        Arrays.sort(arr);  // ascending order
	        int[] arr2 = new  int[arr.length];   // can contain all values of arr
	        int j=0;
	        
	        for(int i = arr.length-1;  i >= 0 ; i-- ) {
	                arr2[j] = arr[i];
	            //  arr2[arr.length-1-i] = arr[i]; can work this way
	                    j++;
	        }
	        
	        return arr2;
	    }
	    
	    //double method
	    public static double[] SortDe(double[] arr) {
	        Arrays.sort(arr);  // ascending order
	        double[] arr2 = new  double[arr.length];   // can contain all values of arr
	        int j=0;
	        
	        for(int i = arr.length-1;  i >= 0 ; i-- ) {
	                arr2[j] = arr[i];
	            //  arr2[arr.length-1-i] = arr[i];
	                    j++;
	        }
	        
	        return arr2;
	    }
	    
	    //char method
	    public static char[] SortDe(char[] arr) {
	        Arrays.sort(arr);  // ascending order
	        char[] arr2 = new  char[arr.length];   // can contain all values of arr
	        int j=0;
	        
	        for(int i = arr.length-1;  i >= 0 ; i-- ) {
	                arr2[j] = arr[i];
	            //  arr2[arr.length-1-i] = arr[i];
	                    j++;
	        }
	        
	        return arr2;
	    }
	    //String method
	    public static String[] SortDe(String[] arr) {
	        Arrays.sort(arr);  // ascending order
	        String[] arr2 = new  String[arr.length];   // can contain all values of arr
	        int j=0;        
	        for(int i = arr.length-1;  i >= 0 ; i-- ) {
	                arr2[j] = arr[i];
	            //  arr2[arr.length-1-i] = arr[i];
	                    j++;
	        }
	        
	        return arr2;
	    }
	    //wrapper class Integer method
	    public static Integer[] SortDe(Integer[] arr) {
	        Arrays.sort(arr);  // ascending order
	       Integer[] arr2 = new  Integer[arr.length];   // can contain all values of arr
	        int j=0;        
	        for(int i = arr.length-1;  i >= 0 ; i-- ) {
	                arr2[j] = arr[i];
	            //  arr2[arr.length-1-i] = arr[i];
	                    j++;
	        }
	        
	        return arr2;
	    }
}
