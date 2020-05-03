package Lesson07_MethodVoid;

public class WarmUpTask {

	public static void main(String[] args) {
		mergeStrings("wooden","spoon");
       CountWord("one two thre");
       inputLimit("LAylo",5);
   	String arr1[]= {"Muhtar"};
	String arr2[]= {"Cybertek Batch12"};
	LongestOne(arr1[0],arr2[0]);
	 int Arr1[] = {1,2,3};
	    int Arr2[] ={4,5,6};
	  
	
	}
	/*1. Write a method mergeStrings that will return the strings merged, one letter at a time, 
	 * starting with one.   Please note one and two can be of different lengths. Please look at below examples:
	s1 ==> "12345"
	s2 ==> "abcde"
	mergeStrings(s1,s2) ==> "1a2b3c4d5e"
	mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
	mergeStrings("java", "selenium") ==> "jsaevlaenium*/
	
	public static void mergeStrings(String a, String b) {
		if (a.length() > b.length()) {
			for (int i = 0; i < b.length(); i++) {
				System.out.print("" + a.charAt(i) + b.charAt(i));
			}
		} else {
			for (int i = 0; i < a.length(); i++) {
				System.out.println("" + a.charAt(i) + b.charAt(i));
			}
		}
		System.out.println();
	}
    
/*2. write a method that gets a string and returns the word count of that string.
example:
wordCount("foo bar") ==> 2
wordCount("one two three") ==> 3
wordCount("bla") ==> 1*/
	
	public static void CountWord(String str) {
    	String word[]=str.split(" ");//array split method ishlatib suzlarni tarqatib olish kk birinchi,
    	System.out.println(word.length);//keyin 0 ,1,2,3.... length bn count qilish kk
    	 }
/*3. write a method that gets a string and an int, what it dose is limit the inputted string to a cretin number of characters.
example:
limit("abcd",2) ==> "ab*/
	
	public static void inputLimit(String input, int num) {
		for (int i = 0; i < num; i++) { //number ga 3 bersang , string suzini 3 ta harf qilib yozadi, int ni 5 ga uzfartirsan 5 harf yozadi
			System.out.print(input.charAt(i));
		}
		System.out.println();
	}
/*4. write a method gets two strings and prints the longest one
    longest("muhtar", "Cybertek Batch12") ==> Cybertek Batch12*/
	public static void LongestOne(String str1,String str2) {
	     int len=str1.length();
	     int len1=str2.length();
	     if(len>len1) {
	    	 System.out.println(str1);//Cybertek Batch12
	     }else
	    	 System.out.println(str2);
	    	  
	      }
	/*5. write a method that can merge two arrays into one
example:
    int arr1[] = {1,2,3};
    int arr2[] ={4,5,6};
    mergeOne(arr1, arr2); ==> [1,2,3,4,5,6]*/
	public static void MergeTwoArray(int[] a1 , int[] a2) {
		  int[] a3 = new int[ a1.length + a2.length];
		     		     
		     for(int i=0; i <a1.length; i++) {
		         a3[i] = a1[i];  // assigning array1' each index to the array3
		     }
		     
		       for(int i=0; i < a3.length; i++) {
		         System.out.print(a3[i]+" "); //1 2 3 0 0 0
		         
		     }
		       System.out.println("\n second part");
		       for(int i=0; i <a2.length; i++) {
		           a3[i+a1.length] = a2[i];  
		           // assigning array2' each index to the array remaining index
		       }		       
		         for(int i=0; i < a3.length; i++) {
		           System.out.print(a3[i]+" ");//1 2 3 4 5 6 7
		       }
		         System.out.println();
		
	}
	    	
	}
