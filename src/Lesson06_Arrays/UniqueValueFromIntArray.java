package Lesson06_Arrays;

public class UniqueValueFromIntArray {

    /*
    1. Write a program that can print out the unique values from an int Array
       Ex: 
           if arr -> {1,1,2,3,3}
           output: 2
           if arr -> {1,2,2,3,4,4}
           output:  1  3
    */
   public static void main(String[] args) {
       
       int[] arr = {1, 1, 2, 2 ,3, 4,  4 , 8, 7, 9 };
       
       
   for( int  j = 0; j < arr.length; j++) {//outer loop. 
       
       int count = 0 ; 
       for(int i = 0; i < arr.length; i++ ) {//inner loop
           if( arr[i] == arr[j] ) {//compares each index of array with the given value. j runs 1 times, i runs 7 times
               count++;//every time if value is occured in the array, count
           }
       }
       
       if(count == 1) {//if unique ch count qilib bulgandn keyin 1 deb topildimi, shunu 1 ta unik deb hisobla
           System.out.println( arr[j] );
       }
       }
}

}



