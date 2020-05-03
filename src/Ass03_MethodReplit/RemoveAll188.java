package Ass03_MethodReplit;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll188 {

	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
        String str="hi";
        removeAll(wordList,str);
	}

public static void removeAll(ArrayList<String> wordList,String targetWord) {
        
	wordList.removeAll(Arrays.asList(targetWord));
    }
}
	// this way didn work on the replit
	// loop it also does not work, remove method not designed for loop
	  
	 /*  ArrayList<String> str = new ArrayList<String>((wordList));   
     str.removeAll( Arrays.asList(targetWord) );  
	      System.out.println(str);	}}*/

/*Create a static method that:
is called removeAll
returns nothing
takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord
This method should go through every element of wordList and remove every instance of targetWord 
from the ArrayList.
Example:
ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
removeAll(wordList,"hi");
now wordList is ["hey","yo"]*/