package Ass03_MethodReplit;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineArrayList187 {

	public static void main(String[] args) {
		
		 ArrayList<String> listOne = new ArrayList<>(Arrays.asList("lay", "lol", "tall", "bi", "add"));
	     ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("all", "bee", "cat", "dog", "ell"));
	     ArrayList<String> result= combineAl(listOne,listTwo);
	     System.out.println(result);
	}
	public static ArrayList<String> combineAl(ArrayList<String> wordList1,ArrayList <String> wordList2){
	    for (int i = 0; i < wordList2.size(); i++) {
	    	wordList1.add(wordList2.get(i));
	   }
		return wordList1;
		
	}

	
	
}
/*Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2
This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, 
then add all the words (in order) from wordList2.  In other words, it is combining all the elements 
from the two parameters.*/