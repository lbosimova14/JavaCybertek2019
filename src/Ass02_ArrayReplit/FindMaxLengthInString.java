package Ass02_ArrayReplit;

import java.util.Scanner;

public class FindMaxLengthInString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		
		String longest="";
		int max=0;
		for(int i = 0; i < 5;  i++) {
		  words[i] = input.nextLine();//words is looping 5 times
		  if(words[i].length()!=2) {
		  if(words[i].length()>max) {
			  longest=words[i];
		  }
		}
		}
		//write your code below
System.out.println(longest);


	}
	 
}
/*Given the array words, it will print the word with the largest length.
 *  Assume that there are no 2 words with longest length
Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa*/