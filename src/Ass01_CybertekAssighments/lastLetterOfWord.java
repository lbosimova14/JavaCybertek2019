package Ass01_CybertekAssighments;

import java.util.Scanner;

public class lastLetterOfWord {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    System.out.println(word.charAt(word.length()-1));
/*The index starts from zero and ranges to length() - 1 where length() return the length of String.
 *  It's similar to an array where the first element is stored at zeroth index and the last element is stored
 *   at length -1 index because String is nothing but backed by a character array. 
 *   If the value of the index is invalid i.e. it's lower than zero or negative or higher than length - 1 
 *   then this method throws an IndexOutOfBoundsException
 * 
 */
	}

}
