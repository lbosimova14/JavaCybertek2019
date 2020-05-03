package Ass03_MethodReplit;

public class Merge166 {
	public static void main(String[] args) {
		
	
	String str=mergeStrings("12345","abcde");
	System.out.println(str);
	
}	
	public static String mergeStrings(String one, String two) {
		  //compare max size first
		int compareSize=(one.length()>two.length())? one.length() : two.length();
		
		// To store the final string  
           String result = ""; 

// For every index in the strings  
for (int i = 0; i<compareSize; i++)  
{  
    // first string if it exists  
    if (i < one.length())  
        result += one.charAt(i); 
 
    // second string if it exists  
    if (i < two.length())  
        result += two.charAt(i); 
}  
return result;  

		  }//method ending

}//class ending	  
			
/*When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"


mergeStrings("wooden", "spoon") ==> "wsopoodoenn"


mergeStrings("java", "selenium") ==> "jsaevlaenium"*/