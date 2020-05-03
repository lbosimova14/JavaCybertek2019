package Ass01_CybertekAssighments;

import java.util.Scanner;

public class CountJavaDuplicateJavaUsingForLoop {

	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in);
		    String word = scan.next();
		int count=0;
		for(int i=0;i<word.length()-3;i++) {
		   if(word.substring(i,i+4).equalsIgnoreCase("java")) {
			   count++;
		   }
		}
			System.out.println(count);
		/*String sentence ="book book book book book";
        // index:        z
    int count = 0;
    for(int z= 0; z < sentence.length() - 3 ; z++) {
        if(sentence.substring(z, z+4 ).equals("book") ) {
                //            0, 4
                //            1, 5
                 //           2, 6
            //               ...
            //                16,  20  ==> 16, 19
            
            count++;
        }  
    }	    
    System.out.println(count);*/

	}

}
/*
Return the number of times that the string "java" appears anywhere in the given string word.
Example:
input: javaxjava
output: 2
Example:
input: javaxjavaapplepearjavaegg
output: 3*/