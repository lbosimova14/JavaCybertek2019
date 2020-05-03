package Ass02_ArrayReplit;

import java.util.Scanner;

public class GetSandwich {

	private static final CharSequence str = null;

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	    /* boolean contain=str.contains("bread");
	    
	     if(contain ) {
	 	int begin = str.indexOf("bread");
	 	int end = str.lastIndexOf("bread");
	 	
	 	String middle =  str.substring(begin+5, end  );//jam
	 	System.out.println(middle);
	 	}else
	 		System.out.println("nothing");*/
	 	
	   /*  int i = 0;
		  while (true) {
			 
		    int found = str.indexOf("bread", i);
		    if (found == -1) break;
		   
		    int start = found + 5; // start of actual bread
		    int end = str.indexOf("bread", start);
		    System.out.println(str.substring(start, end));
		    i = end + 1;  // advance i to start the next iteration
		   
		  }*/
	int count=0;
	int b=0,l=0,c=0;
	     for (int i = 0; i<str.length()-4; i++) {
             if (str.substring(i, i+5).contains("bread")) {
             count++;
                 if (count == 1) {
                  b = i;
                 }
             }
         }
       
         if (count >1) {
             for (int j = str.length(); j>4; j--) {
                 if (str.substring(j-5, j).contains("bread")) {
                     l++;
                     if (l == 1) {
                         c=j-5;
                     }
                 }
              }
             System.out.println(str.substring(b+5,c));
         }
         else {
             System.out.println("nothing");
         
         }    
	}
}
/*A sandwich is two pieces of bread with something in between.
 * Print the string that is between the first and last appearance of "bread" in the given string, 
 * or return string "nothing" if there are not two pieces of bread.
Example:
input: breadjambread
output: jam
Example:
input: xxbreadjambreadyy
output: jam
Example:
input: xxbreadapple
output: nothing
Example:
input: breadbutterbread
output: butter*/


/*  int mid = s.length()/2; //Calculate the mid position

//To extract characters towards the end
for (int i = mid ; i < s.length() ; i++)
  System.out.print(s.charAt(i));

//To extract characters from beginning 
for (int i = 0 ; i <= mid ; i++) 
  System.out.print(s.charAt(i))*/